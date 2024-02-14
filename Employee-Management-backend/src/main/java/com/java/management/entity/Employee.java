package com.java.management.entity;



@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "employees")
public class Employee {
	
	@jakarta.persistence.Id
	@jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
	private long id;
	
	@jakarta.persistence.Column(name = "first_name")
	private String firstName;

	@jakarta.persistence.Column(name = "last_name")
	private String lastName;
	
	@jakarta.persistence.Column(name = "email_id")
	private String emailId;
	
	@jakarta.persistence.Column(name = "Designation")
	private String Designation;
	
	@jakarta.persistence.Column(name = "Salary")
	private Double salary;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Employee(long id, String firstName, String lastName, String emailId, String designation, Double salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		Designation = designation;
		this.salary = salary;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}

