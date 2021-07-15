package com.demo.app.model;

import java.io.File;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Objects;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Scope("prototype")
public class Employee implements Serializable,Comparable<Employee>{
	
	@Value("${employee.Id}")
	private int employeeId;
	
	@Value("${employee.Name}")
	private String employeeName;
	
	@Value("${employee.Salary}")
	private int employeeSalary;
	
	private File f1;
	
	@Autowired
	private EmployeeType et;
	
	@Autowired
	private Project p;
	
	@Autowired
	private List<Task> tasks;
	
	public Employee() {
		super();
		//System.out.println(" Constructor called");
	}
	
	public Employee(int employeeId, String employeeName, int employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	
	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public EmployeeType getEt() {
		return et;
	}

	public void setEt(EmployeeType et) {
		this.et = et;
	}

	public Project getP() {
		return p;
	}

	public void setP(Project p) {
		this.p = p;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(employeeId, employeeName, employeeSalary);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return employeeId == other.employeeId && Objects.equals(employeeName, other.employeeName)
				&& employeeSalary == other.employeeSalary;
	}


	public void empDetails() {

		System.out.println("Tasks Assigned......");
		for (Task task : tasks) {
			System.out.println(task);
		}
		System.out.println();
	}
	
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public String toString() {
		
		System.out.println();
		
		if(p==null || et==null)
		{
		
			return "EmployeeId = " + employeeId + "\nEmployeeName = " + employeeName + "\nEmployeeSalary = "
					+ employeeSalary + "\nEmployeeType = Not Assigned \nProject Assigned = Not Assigned" + p;
		}

		return "EmployeeId = " + employeeId + "\nEmployeeName = " + employeeName + "\nEmployeeSalary = "
				+ employeeSalary + "\nEmployeeType = " + et + "\nProject Assigned = " + p;
	
	}
	
	//---------Spring Life Cycle Methods-------------
	
	public void doInIt()
	{
		System.out.println("Do InIt method is Called!!!!");
		try {
			
			 f1 = new File("C:\\Demo\\Employee.txt");
			//new Employee().doDestroy();
			
			
		} catch (Exception e) {
				System.out.println(e);
		}
	}

	
	
	
	  public void doDestroy() 
	  { 
		  
		  try {
	  
			  		System.out.println("\nDo Destroy method is Called!!!!");
			  		System.out.println(" Printing ...."); PrintWriter pw = new PrintWriter(f1);
			  		pw.write("EmployeeId = " + getEmployeeId() + "\nEmployeeName = " +
			  				getEmployeeName() + "\nEmployeeSalary = " + getEmployeeSalary() +
			  				"\nEmployeeType = " + getEt() + "\nProject Assigned = " + getP() +
			  				"\nTasks Assigned = " + getTasks()); pw.close();
			  		System.out.println("done ---");
	  
	  
		  		} 
		  catch (Exception e) 
		  { 
			  System.out.println(e); 
		  }
	  
	  }
	 
	 

	/*
	 * @Override public void destroy() throws Exception {
	 * System.out.println("\nDo Destroy method is Called!!!!");
	 * System.out.println(" Printing ...."); PrintWriter pw = new PrintWriter(f1);
	 * pw.write("EmployeeId = " + getEmployeeId() + "\nEmployeeName = " +
	 * getEmployeeName() + "\nEmployeeSalary = " + getEmployeeSalary() +
	 * "\nEmployeeType = " + getEt() + "\nProject Assigned = " + getP() +
	 * "\nTasks Assigned = " + getTasks()); pw.close();
	 * System.out.println("done ---");
	 * 
	 * }
	 */
	
}
