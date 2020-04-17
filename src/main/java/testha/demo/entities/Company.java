package testha.demo.entities;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class Company {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(length=50, nullable=false, unique=true)
    @NotBlank
    private String name;

    public Company(String name) {
        this.name = name;
    }

    public Company(){}

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
