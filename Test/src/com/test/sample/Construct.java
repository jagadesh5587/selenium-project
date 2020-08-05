package com.test.sample;

public class Construct extends Methods {
	
	public Construct() {
		super("hell");
	System.out.println("emp info");
	}

	public Construct(String name) {
		this(789);
		System.out.println("emp name" + name);
	}
	public Construct(int age) {
		this();
		System.out.println("emp age" + age);
	}
	public void Method() {
		System.out.println("i am a method");

	}
	public static void main(String[] args) {
		Construct c = new Construct("sid");
	}

}
