package com.project.bookmyshow.dtos;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CreateCustomerDTO {

    private String fullname;

    private String city;

    private String phonenumber;

    private String email;

    private String username;
    private String password;
}
