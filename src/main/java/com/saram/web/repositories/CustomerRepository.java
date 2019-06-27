package com.saram.web.repositories;

import com.saram.web.entities.Customer;

import org.springframework.data.repository.CrudRepository;

/**
 * CustomerRepository
 */
public interface CustomerRepository extends CrudRepository<Customer, Long>{

    
}