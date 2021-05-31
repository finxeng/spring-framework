package com.lovejobs.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 */
public class DynamicActionClient {

	public static void main(String[] args) {
		Action action = new WomanAction();
		InvocationHandler invocationHandler = new DynamicProxy(action);
		Action action1  = (Action) Proxy.newProxyInstance(Action.class.getClassLoader(), new Class<?>[]{Action.class},invocationHandler);
		try {
			action1.saySomething();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
