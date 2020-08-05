package com.test.sample;


public class Test {
public static void main(String[] args) {
int[] zip= new int [5];
zip[0]=7;
zip[1]=3;
zip[2]=4;
zip[3]=1;
zip[4]=9;
int j=3;
System.out.println(zip[	j-(zip.length-zip[1]-2)]);
}

}
