package com.lovejobs;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactoryTests;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

public class BeanDefinePersonalTest {

	@Test
	public void testBeanDefineTest(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanFactoryPersonalTest.xml");
		BeanDefinePersonal beanDefinePersonal = (BeanDefinePersonal) applicationContext.getBean("beanDefinePersonal");
		System.out.println(beanDefinePersonal);
	}

	@Test
	public void testBeanFactory(){
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("beanFactoryPersonalTest.xml");
		BeanDefinePersonal beanDefinePersonal = (BeanDefinePersonal) beanFactory.getBean("beanDefinePersonal");
		System.out.println(beanDefinePersonal);

		DefaultListableBeanFactory beanFactory1 = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(beanFactory1);
		xmlBeanDefinitionReader.loadBeanDefinitions("beanFactoryPersonalTest.xml");
		BeanDefinePersonal beanDefinePersonal1 = (BeanDefinePersonal) beanFactory1.getBean("beanDefinePersonal");
		System.out.println(beanDefinePersonal1);
	}
}
