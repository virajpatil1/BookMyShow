package com.project.bookmyshow.controller;


import com.project.bookmyshow.dtos.CreateCustomerDTO;
import com.project.bookmyshow.exceptions.IllegalEmailException;
import com.project.bookmyshow.models.Customer;
import com.project.bookmyshow.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/customer")
@AllArgsConstructor
public class customerController {

    private CustomerService customerService;
    

    //get customer
    @GetMapping("/{id}")
    public Customer getCustomer(@PathVariable Long id){

        return customerService.getCustomer(id);

    }

    @PostMapping
    public  Customer createCustomer(@RequestBody CreateCustomerDTO request){

        validateCustomer(request);

        return customerService.createCustomer(request);
    }

    private void validateCustomer(CreateCustomerDTO request) {

        if(request.getEmail() == null){
            throw new IllegalEmailException();
        }
    }
}
