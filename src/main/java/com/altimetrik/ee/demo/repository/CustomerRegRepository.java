package com.altimetrik.ee.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.altimetrik.ee.demo.entity.ComponentDetailsEntity;
import com.altimetrik.ee.demo.entity.Customer;

@Repository
public interface CustomerRegRepository extends JpaRepository<Customer, Long> {

	<S extends Customer> S save(final S customer);

}
