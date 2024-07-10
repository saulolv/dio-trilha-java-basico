package study.addressuser.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import study.addressuser.models.Address;

@Repository
public interface AddressRepository extends CrudRepository<Address, String> {
}
