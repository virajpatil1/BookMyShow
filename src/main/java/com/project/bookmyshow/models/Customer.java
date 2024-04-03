package com.project.bookmyshow.models;


import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Builder
public class Customer extends BaseModel {

    private String fullname;

    private String city;

    private String phonenumber;

    private String email;

    @OneToOne
    private User user;
}
