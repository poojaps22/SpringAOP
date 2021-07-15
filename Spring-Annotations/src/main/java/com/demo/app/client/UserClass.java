package com.demo.app.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.app.model.Employee;

public class UserClass {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext spring = new ClassPathXmlApplicationContext("spring-conf.xml");
		
		/*Employee emp = (Employee)spring.getBean("newEmp");
		System.out.println(emp); 
		*/
		
/*		Employee emp1 = (Employee)spring.getBean("newEmp");
		emp1.setEmployeeName("Mike");
		System.out.println(emp1);
*/		
		
		Employee emp2 = (Employee)spring.getBean("employee");
		System.out.println(emp2);
		emp2.empDetails();
		
		spring.close();
		
	}
	
}
