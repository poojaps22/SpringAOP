package com.demo.app.util;

import java.time.LocalDateTime;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoginClass {

	//@After("execution(public void com.demo.app.service.UserService.doAddEmployee())")
	@After("execution(public * do*())")
	public void doLogin()
	{
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("Login Info --------- "+dateTime);
	}
	
	@After("execution(public * do*(*))") 
	public void doLogin(JoinPoint joinPoint)
	{
		LocalDateTime dateTime = LocalDateTime.now();
		
		Object obj[] = joinPoint.getArgs();
		int amt=0;
		//String s="";
		for (Object arg : obj) {
			
			/*
			 * if(arg instanceof String) { s = (String)arg; }
			 */
			amt=(int)arg;
			
		}
		
		System.out.println("Login Info with Payment Amount of "+amt+" --------- "+dateTime);
	}
	
}
