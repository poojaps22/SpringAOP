package com.demo.app.service;

import org.springframework.stereotype.Component;

@Component
public class UserService 
{

	public void doAddEmployee()
	{
		System.out.println("Adding Employee ----------------");
	}
	
	public void doSalaryPayment()
	{
		System.out.println("Salary Payment is Done ----------------");
	}
	
	public void doSalaryPayment(int amount)
	{
		System.out.println("Salary Payment is Done ----------------"+amount);
	}
	
}
