package com.lovejobs.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class AspectJController {

	@Pointcut("execution(* com.lovejobs.config.bean..*.getName(..))")
	public void getNamePoint(){
	}

	@Before("getNamePoint()")
	public void beforeTest(){
		System.out.println("before test");
	}

	@After("getNamePoint()")
	public void afterTest(){
		System.out.println("after test");
	}

	@Around("getNamePoint()")
	public Object aroundTest(ProceedingJoinPoint p ){
		System.out.println("around begin");
		Object o = null;
		try {
			o = p.proceed();
		} catch (Throwable throwable) {
			throwable.printStackTrace();
		}
		System.out.println("around end");
		return o;
	}

}
