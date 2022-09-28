package com.crm.interviews;

import java.util.Scanner;

public class StrPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.next();
		int len=str.length();
		String org=str;
		String rev="";
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
			
		}
		if(org.equals(rev)) {
			System.out.println("String palindrome");
		}
		else {
			System.out.println("not palindrome");
		}

	}

}
