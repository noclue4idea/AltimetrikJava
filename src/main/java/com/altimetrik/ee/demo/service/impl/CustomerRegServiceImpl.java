package com.altimetrik.ee.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.altimetrik.ee.demo.entity.Customer;
import com.altimetrik.ee.demo.repository.ComponentDetailsRepository;
import com.altimetrik.ee.demo.repository.CustomerRegRepository;
import com.altimetrik.ee.demo.service.CustomerRegService;

@Service
public class CustomerRegServiceImpl implements CustomerRegService{

	@Autowired
	private CustomerRegRepository customerRegRepository;
	
	
	@Override
	public void registerUser(Customer customer) {
		
		if(customer.getEmail()==null || customer.getPassword()==null || customer.getName()==null)
		{
			return;
		}
		this.customerRegRepository.save(customer);
	}

}
