package com.test.sample;
import java.util.Vector;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Collections {
	public static void main(String[] args) {
		List<Integer> l = null;

Scanner sc = new Scanner(System.in);
String n = sc.next();

if(n.equals("Arraylist")) {
	l=new ArrayList<>();
}
if(n.equals("LinkedList")) {
	l=new LinkedList<>();
} 
else if(n.equals("Vector")) {
	l=new Vector<>();
}
l.add(10);
l.add(34);
l.add(654);
System.out.println(l);
	}
}
