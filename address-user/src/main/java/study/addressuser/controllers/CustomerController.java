package study.addressuser.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import study.addressuser.models.Customer;
import study.addressuser.services.CustomerService;

@RestController
@RequestMapping("customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public ResponseEntity<Iterable<Customer>> findAll() {
        return ResponseEntity.ok(customerService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> findById(@PathVariable Long id) {
        return ResponseEntity.ok(customerService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Customer> insert(@RequestBody Customer customer) {
        customerService.insert(customer);
        return ResponseEntity.ok(customer);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Customer> update(@PathVariable Long id, @RequestBody Customer customer) {
        customerService.update(id, customer);
        return ResponseEntity.ok(customer);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        customerService.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
