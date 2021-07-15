package com.demo.app.util;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SecurityClass {
	
	@Before("execution(public void com.demo.app.service.UserService.*(*))")
	public void doSecurity()
	{
		System.out.println("Security code is Executing ---------------");
	}

}