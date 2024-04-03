package com.project.bookmyshow.service;

import com.project.bookmyshow.dtos.CreateCustomerDTO;
import com.project.bookmyshow.exceptions.CustomerNotFoundException;
import com.project.bookmyshow.exceptions.EmailAlreadyExitsException;
import com.project.bookmyshow.models.Customer;
import com.project.bookmyshow.models.User;
import com.project.bookmyshow.repositories.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class CustomerService
{

    private CustomerRepository customerRepository;
    private UserService userService;
    public Customer getCustomer(Long id){

        return  customerRepository
                .findById(id)
                .orElseThrow(() -> new CustomerNotFoundException(id));
    }

    public Customer createCustomer(CreateCustomerDTO request) {

        //create a user

        Optional<Customer> customerExists = customerRepository.findCustomerByEmail(request.getEmail());

        if(customerExists.isPresent()){
            throw new EmailAlreadyExitsException();
        }

        User user = userService.createNewUser(request.getUsername(),request.getPassword());

        Customer customer = Customer.builder()
                .fullname(request.getFullname())
                .city(request.getCity())
                .email(request.getEmail())
                .phonenumber(request.getPhonenumber())
                .user(user)
                .build();

        return customerRepository.save(customer);
    }
}
