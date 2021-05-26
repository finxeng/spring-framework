package com.lovejobs;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactoryTests;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanDefinePersonalTest {

	@Test
	public void testBeanDefineTest(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanFactoryPersonalTest.xml");
		BeanDefinePersonal beanDefinePersonal = (BeanDefinePersonal) applicationContext.getBean("beanDefinePersonal");
		System.out.println(beanDefinePersonal);
	}
}
