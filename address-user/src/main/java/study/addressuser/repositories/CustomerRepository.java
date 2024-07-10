package study.addressuser.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import study.addressuser.models.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
