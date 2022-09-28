package com.crm.interviews;

import java.util.Scanner;

public class Greatestof3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter firstno");
		int a=sc.nextInt();
		System.out.println("Enter second no");
		int b=sc.nextInt();
		System.out.println("Enter third no");
		int c=sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println("a is geater"+a);
		}
		if(b>a && b>c) {
			System.out.println("bis greater"+b);
		}
		if(c>a && c>b) {
			System.out.println("c is greater"+c);
		}
	}

}
