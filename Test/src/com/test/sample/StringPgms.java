package com.test.sample;

import java.io.EOFException;
import java.io.IOException;
import java.util.Scanner;

public class StringPgms {
    public static void main(String[] args)
    {
Scanner s = new Scanner(System.in);
String n = s.next();
int vow = 0;
for (int i = 0; i < n.length(); i++) {
	char c = n.charAt(i);
	if(c=='A'|| c=='a' || c=='E'||c=='e'||c=='i'||c=='I'||c=='o'||c=='u') {
		
		vow++;
			}
}    

System.out.println(vow);
    
    }
    }