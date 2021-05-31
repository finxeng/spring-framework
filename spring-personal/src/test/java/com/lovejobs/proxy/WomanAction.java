package com.lovejobs.proxy;

public class WomanAction implements Action{

	private String name = "woman";

	@Override
	public void saySomething() {
		System.out.println(name.concat(" saying"));
	}
}
