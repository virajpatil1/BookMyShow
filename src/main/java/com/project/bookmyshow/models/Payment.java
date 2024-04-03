package com.project.bookmyshow.models;

import com.project.bookmyshow.enums.PaymentMethodType;
import com.project.bookmyshow.enums.PaymentStatus;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Payment extends BaseModel {

    private String reference;
    private Double amount;

    private PaymentMethodType providerType;

    private PaymentStatus status;
}