package com.lovejobs.controller;

import com.lovejobs.service.NoAnnotationHelloService;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NoAnnotationHelloController implements Controller {

	private NoAnnotationHelloService noAnnotationHelloService;

	public void setNoAnnotationHelloService(NoAnnotationHelloService noAnnotationHelloService) {
		this.noAnnotationHelloService = noAnnotationHelloService;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView modelView = new ModelAndView();
		modelView.setViewName(noAnnotationHelloService.get());
		return modelView;
	}
}
