package testha.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import testha.demo.entities.Company;
import testha.demo.exception.EntityNotFoundException;
import testha.demo.exception.ErrorMessage;
import testha.demo.exception.FieldErrorMessage;
import testha.demo.service.CompanyService;

import javax.validation.Valid;
import javax.xml.bind.ValidationException;
import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class CompanyController {
    private CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping("/company")
    public List<Company> getCompanies() throws ValidationException {
        List<Company> companies = companyService.getCompanies();
        if (companies.isEmpty()) {
            throw new ValidationException("there are no companies");
        }
        return companies;
    }

    @RequestMapping(value = "/company/{companyId}", method = GET)
    public Company getCompany(@PathVariable Long companyId) throws ValidationException {
        return companyService.getCompany(companyId);

    }

    @PostMapping("/company")
    public Company createCompany(@Valid @RequestBody Company company) throws ValidationException {
        return companyService.save(company);
    }


    /*@ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    List<FieldErrorMessage> exceptionHandler(MethodArgumentNotValidException e) {
        List<FieldError> fieldErrors = e.getBindingResult().getFieldErrors();
        List<FieldErrorMessage> fieldErrorMessages = fieldErrors
                .stream()
                .map(fieldError -> new FieldErrorMessage(fieldError.getField(), fieldError.getDefaultMessage()))
                .collect(Collectors.toList());
        return fieldErrorMessages;
    }*/
}
