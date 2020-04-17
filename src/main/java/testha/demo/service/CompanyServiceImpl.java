package testha.demo.service;

import org.springframework.stereotype.Service;
import testha.demo.entities.Company;
import testha.demo.exception.EntityNotFoundException;
import testha.demo.repository.CompanyRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyServiceImpl implements CompanyService{

    private final CompanyRepository companyRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository){
        this.companyRepository = companyRepository;
    }

    @Override
    public List<Company> getCompanies() throws EntityNotFoundException {
        return companyRepository.findAll();
    }

    @Override
    public Company getCompany(Long companyId) {
        Optional<Company> company = companyRepository.findById(companyId);
        if (company.isPresent()) {
            return company.get();
        } else {
            throw new EntityNotFoundException();
        }

    }

    @Override
    public Company save(Company company) {
        return companyRepository.save(company);
    }
}
