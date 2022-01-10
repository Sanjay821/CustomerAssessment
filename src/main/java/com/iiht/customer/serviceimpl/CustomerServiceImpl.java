package com.iiht.customer.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.iiht.customer.entity.Customer;
import com.iiht.customer.repository.CustomerRepository;
import com.iiht.customer.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepo;

	@SuppressWarnings("unchecked")
	@Override
	public ResponseEntity<Customer> addCustomer(Customer customer) {
		
		return customerRepo.save(customer) != null? ResponseEntity.ok(customer):(ResponseEntity<Customer>) ResponseEntity.status(HttpStatus.NOT_FOUND);
	}

	@Override
	public ResponseEntity<?> getCustomer() {
		
		List<Customer> allCustomer = customerRepo.findAll();
		
		return  ResponseEntity.ok(allCustomer);
	}
	
	
}
