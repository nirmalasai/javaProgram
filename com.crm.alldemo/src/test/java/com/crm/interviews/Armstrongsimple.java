package com.crm.interviews;

import java.util.Scanner;

public class Armstrongsimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int org=num;
		int armstrong=0;
		int rev=0;
		while(num>0) {
			rev=num%10;
			armstrong=(rev*rev*rev)+armstrong;
			num=num/10;
		}
		if(org==armstrong) {
			System.out.println("armstrong");
		}else {
			System.out.println("not armstrong");
		}
		
	}

}
