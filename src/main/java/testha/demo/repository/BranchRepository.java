package testha.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import testha.demo.entities.Branch;

@Repository
public interface BranchRepository extends CrudRepository<Branch, Long> {
}
