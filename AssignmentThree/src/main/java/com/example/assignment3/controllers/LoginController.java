/**
 * 
 */
package com.example.assignment3.controllers;

import java.util.ArrayList;

import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

import com.example.assignment3.model.Policy;
import com.example.assignment3.model.User;
import com.example.assignment3.service.InsuranceAgentService;

/**
 * @author Admin
 *
 */
@Controller
@Path("query-params")
public class LoginController {
	
	@Autowired
	private InsuranceAgentService service;

	@Autowired
	RestTemplate restTemplate;

	@PostMapping("/submit")
	public String validateUser(@ModelAttribute(name = "user") User user, Model model) {
		User usr = (User) model.getAttribute("user");
		if (usr.getUsername().equals("admin") && usr.getPassword().equals("password")) {
			populateCustomerDetails(usr);
			return "Success";
		} else
			return "Error";
	}

	private void populateCustomerDetails(User user) {
		user.setCustomerList(service.getAllCustomers(user.getUsername()));
	}

	@GetMapping("/home/policyDetails/")
	private String getPolicyDetails(@QueryParam("customerId") String customerId, Model model) {
		System.out.println("Getting Policy details for customer " + customerId);
		ArrayList<Policy> response = restTemplate
				.exchange("http://Customer-Management-System/home/policyDetails/{customerId}", HttpMethod.GET, null,
						new ParameterizedTypeReference<ArrayList<Policy>>() {
						}, customerId)
				.getBody();
		Policy p = new Policy();
		p.setList(response);
		System.out.println(model.getAttribute("user"));
		model.addAttribute("policyDetail",p);
		return "PolicyDetail";
	}
	
	private void setPolicyDetailsToView(ArrayList<Policy> response) {
		  
	}

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
