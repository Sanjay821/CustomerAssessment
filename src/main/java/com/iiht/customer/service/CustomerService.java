package com.iiht.customer.service;

import org.springframework.http.ResponseEntity;

import com.iiht.customer.entity.Customer;

public interface CustomerService {

	ResponseEntity<Customer> addCustomer(Customer customer);

	ResponseEntity<?> getCustomer();

}
