package com.iiht.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iiht.customer.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
