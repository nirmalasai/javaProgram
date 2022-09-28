package com.crm.interviews;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int org=num;
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		if(rev==org) {
			System.out.println("the given number is a palindrom"+rev);
		}
			else {
				System.out.println("not palindrome");
			
			}
		
	}

}
