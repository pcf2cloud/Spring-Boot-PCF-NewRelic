package com.example.demo.service;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.domain.Employee;

@Service
public class CloudService {

	private List<Employee> empList;
	
	
	
	public CloudService() {
		empList = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			Employee e = new Employee("SSN"+i, "Employee_"+i, "ICCODE_"+i);
			empList.add(e);
		}
		for (Iterator<Employee> iterator = empList.iterator(); iterator.hasNext();) {
			Employee employee =  iterator.next();
			System.out.println(employee.toString());
			
		}
		
	}

	public Employee findBySSN(String ssn) {
		return new Employee(ssn, "Employee", "ICC0021");
	}
	
	public List<Employee> findAll() {
		for (Iterator<Employee> iterator = empList.iterator(); iterator.hasNext();) {
			Employee employee = iterator.next();
			System.out.println(employee.toString());
			
		}
		return empList;
	}
}
