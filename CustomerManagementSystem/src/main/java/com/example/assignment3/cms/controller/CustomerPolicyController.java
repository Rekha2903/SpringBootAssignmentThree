/**
 * 
 */
package com.example.assignment3.cms.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.example.assignment3.cms.model.PolicyDetail;
import com.example.assignment3.cms.service.CustomerPolicyService;

/**
 * @author Admin
 *
 */
@Controller
public class CustomerPolicyController {
	@Autowired
	RestTemplate restTemplate;

	@Autowired
	private CustomerPolicyService service;

	@GetMapping("/home/policyDetails/{customerId}")
	public ResponseEntity<ArrayList<PolicyDetail>> getAllDepartments(@PathVariable("customerId") int id) {
		ArrayList<PolicyDetail> list = service.getAllPolicyDetails(id);
		return new ResponseEntity<ArrayList<PolicyDetail>>(list, HttpStatus.OK);
	}

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
