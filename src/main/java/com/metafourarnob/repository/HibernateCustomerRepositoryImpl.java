package com.metafourarnob.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.metafourarnob.model.Customer;


@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	@Value("${dbUserName}")
	private String dbUserName;
	@Override
	public List<Customer> findAll() {
		System.out.println(dbUserName);
		List<Customer> customers = new ArrayList<>();
		Customer customer = new Customer();
		customer.setFirstName("Alandi");
		customer.setLastName("Houn");	
		customers.add(customer);
		return customers;

	}

}
