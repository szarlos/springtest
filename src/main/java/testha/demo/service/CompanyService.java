package testha.demo.service;

import testha.demo.entities.Company;

import java.util.List;

public interface CompanyService {
    List<Company> getCompanies();

    Company getCompany(Long companyId);

    Company save(Company company);
}
