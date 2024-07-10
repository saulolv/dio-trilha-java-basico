package study.addressuser.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import study.addressuser.dto.ViaCepResponse;
import study.addressuser.models.Address;
import study.addressuser.models.Customer;
import study.addressuser.repositories.AddressRepository;
import study.addressuser.repositories.CustomerRepository;
import study.addressuser.services.CustomerService;
import study.addressuser.services.ViaCepService;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private ViaCepService viaCepService;


    @Override
    public Iterable<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(Long id) {
        if(customerRepository.findById(id).isPresent()){
            return customerRepository.findById(id).get();
        } else {
            throw new RuntimeException("Customer not found");
        }
    }

    @Override
    public void insert(Customer customer) {
        saveCustomerWithCep(customer);
    }



    @Override
    public void deleteById(Long id) {
        Optional<Customer> customer = Optional.ofNullable(findById(id));
        customerRepository.delete(customer.get());
    }

    @Override
    public void update(Long id, Customer customer) {
        Optional<Customer> customerBd = customerRepository.findById(id);
        if (customerBd.isPresent()) {
            saveCustomerWithCep(customer);
        } else {
            throw new RuntimeException("Customer not found");
        }
    }

    private void saveCustomerWithCep(Customer customer) {
        String cep = customer.getAddress().getCep();
        Address address = addressRepository.findById(cep).orElseGet(
                () -> {
                    ViaCepResponse viaCepResponse = viaCepService.consultarCep(cep);
                    Address newAddress = Address.fromViaCepResponse(viaCepResponse);
                    addressRepository.save(newAddress);
                    return newAddress;
                });
        customer.setAddress(address);

        customerRepository.save(customer);
    }
}
