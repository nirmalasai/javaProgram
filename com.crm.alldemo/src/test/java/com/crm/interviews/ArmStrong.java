package com.crm.interviews;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		int rev=0;
		int armstrong=0;
		int original=number;
		while(number>0) {
			rev=number%10;
			armstrong=(rev*rev*rev)+armstrong;
			number=number/10;	
		}
		System.out.println(armstrong);
		if(original==armstrong) {
			System.out.println("Given number is armstrong");
		}
		else {
			System.out.println("Not armstrong");
		}
	}

}
