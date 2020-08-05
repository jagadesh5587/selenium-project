package com.test.sample;

public class Variablles {

	final String name ="AAA"; 
	
	
	public void collInfo(int rollno, String sname) {
System.out.println("student rollno-"+ rollno + "| Name-" + sname + "| college-"+ name);
	}
	
	
	
	//	static int i=100;
//	
//	public static void info1() {
//int i=45;
//System.out.println(i);
//	}
//private void info() {
//	int i=50;
//System.out.println(this.i);
//}
public static void main(String[] args) {
	
	Variablles v = new Variablles();
//	v.info();
//	 System.out.println(v.i);
//	System.out.println(i);
//	info1();
	v.collInfo(1001, "sid");
	v.collInfo(1002, "arun");
	
}
}
 