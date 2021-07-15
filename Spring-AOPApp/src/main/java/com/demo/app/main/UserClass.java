package com.demo.app.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.app.model.Employee;
import com.demo.app.service.UserService;

public class UserClass {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext spring = new ClassPathXmlApplicationContext("spring-conf.xml");
		
		/*Employee emp = (Employee)spring.getBean("newEmp");
		System.out.println(emp); 
		*/
		
/*		Employee emp1 = (Employee)spring.getBean("newEmp");
		emp1.setEmployeeName("Mike");
		System.out.println(emp1);
		
		Employee emp2 = (Employee)spring.getBean("employee");
		System.out.println(emp2);
		emp2.empDetails();
		
		spring.close();
*/		
		
		UserService userService = (UserService)spring.getBean("userService");
		
		System.out.println(" \n\n------------ New AOP Approach --------- \n\n");
		userService.doAddEmployee();
		
		System.out.println(" \n\n--------- No Argument Call ---------\n\n");
		userService.doSalaryPayment();
		
		System.out.println(" \n\n--------- Make Payment with Argument Call ---------\n\n");
		userService.doSalaryPayment(50000);
		
		
		
	}
	
}
