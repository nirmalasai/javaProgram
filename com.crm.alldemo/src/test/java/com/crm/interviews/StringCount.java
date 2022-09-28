package com.crm.interviews;

import java.util.Scanner;

public class StringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		int count=0;
		char ch[]=str.toCharArray();
		System.out.println(ch);
		for(int i=0;i<ch.length;i++) {
			if(str.charAt(i)=='a') {
				count++;
			}
			
		}
		System.out.println(count);
	}

}
