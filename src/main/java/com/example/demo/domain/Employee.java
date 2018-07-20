package com.example.demo.domain;

public class Employee {

	private String ssn;
	private String name;
	private String iccode;
	public Employee(String ssn, String name, String iccode) {
		super();
		this.ssn = ssn;
		this.name = name;
		this.iccode = iccode;
	}
	public Employee() {
		super();
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIccode() {
		return iccode;
	}
	public void setIccode(String iccode) {
		this.iccode = iccode;
	}
	@Override
	public String toString() {
		return "Employee [ssn=" + ssn + ", name=" + name + ", iccode=" + iccode + "]";
	}
	
}
