/**
 * 
 */
package com.example.assignment3.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.assignment3.model.Customer;

/**
 * @author Admin
 *
 */
public interface CustomerRepo extends CrudRepository<Customer, Integer> {

}
