package testha.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.CommonAnnotationBeanPostProcessor;
import testha.demo.entities.Company;
import testha.demo.repository.CompanyRepository;

@SpringBootApplication
public class DemoApplication {

	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Helloou");
	}

	@Bean
	public CommandLineRunner demo(CompanyRepository repository) {
		return (args) -> {
			repository.save(new Company("compañia A"));
			repository.save(new Company("compañia 2"));
			repository.save(new Company("compañia z"));

			for (Company company : repository.findAll()) {
				log.info("The company is: " + company.toString());
			}
		};
	}

}
