package com.lovejobs;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Map;

public class ApplicationSimpleTest {

//	@Autowired
//	private DefaultListableBeanFactory beanFactory;

	@Test
	public void testXml(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ApplicationSimple applicationSimple = (ApplicationSimple) context.getBean("applicationSimple");
		System.out.println(applicationSimple.getName());

//		ApplicationSimple applicationSimple_1 = (ApplicationSimple) beanFactory.getBean("applicationSimple");
//		System.out.println(applicationSimple.getName());

//		JdbcTemplate template = (JdbcTemplate) context.getBean("jdbcTemplate");
//		Map<String, Object> map = template.queryForMap("select * from mcp_cdn_prov where id=1");
//		System.out.println(JSONObject.toJSONString(map));
	}
}
