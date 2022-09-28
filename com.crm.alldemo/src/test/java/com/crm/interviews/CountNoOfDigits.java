package com.crm.interviews;

import java.util.Scanner;

public class CountNoOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		int count=0;
		while(number>0)
		{
			number=number/10;
			count++;
		}
		System.out.println(count);
	}

}
