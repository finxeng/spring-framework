package com.lovejobs.proxy;

/**
 * 静态代理
 */
public class ActionClient {
	public static void main(String[] args) {
		ProxyAction action_1 = new ProxyAction(new ManAction());
		action_1.saySomething();

		ProxyAction action_2 = new ProxyAction(new WomanAction());
		action_2.saySomething();
	}
}
