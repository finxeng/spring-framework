package com.lovejobs.proxy;

import org.omg.CORBA.SystemException;
import org.omg.CORBA.portable.InputStream;
import org.omg.CORBA.portable.InvokeHandler;
import org.omg.CORBA.portable.OutputStream;
import org.omg.CORBA.portable.ResponseHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {

	private Action action;

	public DynamicProxy(Action action) {
		this.action = action;
	}


	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = null;
		try {
			result = method.invoke(action,args);
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return result;
	}
}
