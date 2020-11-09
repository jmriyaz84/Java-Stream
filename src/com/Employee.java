package com;

class Employee {

	private String firstName;
	
	private String lastName;

	private int empId;

	private int salary;

	private String position;

	private String sex;
	
	private String maritialStatus;
	
	private String status;
	
	private String department;
	
	private String managerName;

	public Employee(String firstName,String lastName, int empId, int salary, String position, String sex, String maritialStatus,
			String status, String department, String managerName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.empId = empId;
		this.salary = salary;
		this.position = position;
		this.sex = sex;
		this.maritialStatus = maritialStatus;
		this.status = status;
		this.department = department;
		this.managerName = managerName;
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



	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getMaritialStatus() {
		return maritialStatus;
	}

	public void setMaritialStatus(String maritialStatus) {
		this.maritialStatus = maritialStatus;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}



	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", empId=" + empId + "]";
	}
	
}