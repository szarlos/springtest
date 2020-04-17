package testha.demo.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Branch {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    public Company getCompanies() {
        return companies;
    }

    public void setCompanies(Company companies) {
        this.companies = companies;
    }

    @ManyToOne
    private Company companies;

    public Branch(String name, Company company) {
        this.name = name;
        this.companies = company;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
