package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Employee;
import com.example.demo.service.CloudService;

@RestController
public class CloudController {
	
	@Autowired
	private CloudService cloudservice;

	@RequestMapping("/")
	public String appStatus() {
		return "Application successfully deployed and started";
	}
	
	@RequestMapping("/{ssn}")
	public Employee findBySSN(@PathVariable("ssn") String ssn) {
		return cloudservice.findBySSN(ssn);
	}
	
	@RequestMapping("/All")
	public List<Employee> findAll() {
		return cloudservice.findAll();
	}
	
}
