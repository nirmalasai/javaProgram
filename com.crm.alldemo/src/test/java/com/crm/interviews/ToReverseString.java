package com.crm.interviews;

public class ToReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java subject";
		char[] ch=s.toCharArray();
		String rev = "";
		int length=s.length();
		for(int i=length-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}

}
