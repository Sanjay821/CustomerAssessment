package com.iiht.customer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.iiht.customer.entity.Customer;
import com.iiht.customer.repository.CustomerRepository;

@SpringBootTest
class CustomerAssessmentApplicationTests {
	
	private Customer cus;
	@Autowired
	private CustomerRepository customerRepository;
	
	@BeforeEach
	void addDummyCustomer() {
	    cus = new Customer(1, "Sanjay", 'm', 21, "veg");
	}

	@Test
	void addCustomerTest() {		
		boolean obj = customerRepository.save(cus) != null;
		
		assertEquals(obj, true);
	}
	
	@Test
	void getCustomer() {
		equals(customerRepository.findAll().size()<0);
		customerRepository.deleteAll();
	}
	
}
