package com.lovejobs.controller;

import com.lovejobs.service.NoAnnotationHelloService;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.util.ObjectUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 实现ApplicationContextAware，用于获取应用上下文，只需要重写setApplicationContext方法即可
 */
public class NoAnnotationHelloController implements Controller, ApplicationContextAware {

	private NoAnnotationHelloService noAnnotationHelloService;

	private ApplicationContext context;

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView modelView = new ModelAndView();
		modelView.setViewName(noAnnotationHelloService.get());
		if(ObjectUtils.isEmpty(context)){
			System.out.println("context is null");
		}else{
			System.out.println("context is not null");
		}
		return modelView;
	}

	public void setNoAnnotationHelloService(NoAnnotationHelloService noAnnotationHelloService) {
		this.noAnnotationHelloService = noAnnotationHelloService;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.context=applicationContext;
	}
}
