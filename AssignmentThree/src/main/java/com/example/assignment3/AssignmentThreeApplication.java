package com.example.assignment3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.assignment3.model.User;

@SpringBootApplication
@EnableDiscoveryClient
@Controller
public class AssignmentThreeApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssignmentThreeApplication.class, args);
	}
	@RequestMapping("/insurance")
	public String mainScreen() {
		return "InsurancePage";
	}

	@GetMapping("/login")
	public String loginScreen(Model model) {
		model.addAttribute("user", new User());
		return "Login";
	}
}
