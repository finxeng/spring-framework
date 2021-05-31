package com.lovejobs.proxy;

public class ProxyAction implements Action{

	private Action action;

	public ProxyAction(Action action) {
		this.action = action;
	}

	@Override
	public void saySomething() {
		action.saySomething();
	}
}
