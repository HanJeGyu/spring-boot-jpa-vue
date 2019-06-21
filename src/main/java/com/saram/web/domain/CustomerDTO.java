package com.saram.web.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * CustomerDTO
 */
@Data
@Lazy
@Component
public class CustomerDTO {

    private String customerId, customerName, password, ssn, phone, city, address, postalcode, photo;
}