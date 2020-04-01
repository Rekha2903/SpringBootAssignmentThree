/**
 * 
 */
package com.example.assignment3.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.assignment3.model.Customer;
import com.example.assignment3.repository.CustomerRepo;

/**
 * @author Admin
 *
 */
@Service
public class InsuranceAgentService {
	
	@Autowired
	private CustomerRepo repo;
	
	public ArrayList<Customer> getAllCustomers(String username) {
		List<Customer> list = new ArrayList<Customer>();
		repo.findAll().forEach(list::add);
		return (ArrayList<Customer>) list.stream().filter(customer->customer.getUserName().equals(username)).collect(Collectors.toList());
	}

}
