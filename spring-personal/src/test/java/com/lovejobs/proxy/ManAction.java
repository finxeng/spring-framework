package com.lovejobs.proxy;

public class ManAction implements Action{

	private String name="man";

	@Override
	public void saySomething() {
		System.out.println(name.concat(" saying"));
	}
}
