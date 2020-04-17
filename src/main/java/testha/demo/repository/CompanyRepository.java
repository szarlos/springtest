package testha.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import testha.demo.entities.Company;

import java.util.List;

@Repository
public interface CompanyRepository extends CrudRepository<Company, Long> {
    @Override
    List<Company> findAll();
}
