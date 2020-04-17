package testha.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import testha.demo.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
