package com.example.employee.model;





public class Employee {

	
	    private int id;
	    private String empName;
	    private int age;
	    private String department;

	    public Employee()
	    {
	    	
	    }

		public Employee(int id, String empName, int age, String department) {
			super();
			this.id = id;
			this.empName = empName;
			this.age = age;
			this.department = department;
		}
		public int getId() {
		    return id;
		}

		public void setId(int id) {
		    this.id = id;
		}

		public String getEmpName() {
		    return empName;
		}

		public void setEmpName(String empName) {
		    this.empName = empName;
		}

		public int getAge() {
		    return age;
		}

		public void setAge(int age) {
		    this.age = age;
		}

		public String getDepartment() {
		    return department;
		}

		public void setDepartment(String department) {
		    this.department = department;
		}

	
	

}
