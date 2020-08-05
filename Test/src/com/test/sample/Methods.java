package com.test.sample;

public class Methods {
	public Methods() {
		this(30);
		System.out.println("super construt with no ags");
	}
	public Methods(int i) {
		System.out.println("super construct with ags");
	}
	public Methods(String s) {
		this();
		System.out.println("super constructor with string ags");
	}
	
	
}


