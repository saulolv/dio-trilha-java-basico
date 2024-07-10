package study.addressuser.services;

import study.addressuser.models.Customer;

public interface CustomerService {
    Iterable<Customer> findAll();

    Customer findById(Long id);

    void insert(Customer customer);

    void deleteById(Long id);

    void update(Long id, Customer customer);
}
