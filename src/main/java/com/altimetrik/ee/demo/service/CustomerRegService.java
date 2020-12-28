package com.altimetrik.ee.demo.service;

import org.springframework.stereotype.Service;

import com.altimetrik.ee.demo.entity.Customer;

@Service
public interface CustomerRegService {
	
	void registerUser(Customer customer);

}
