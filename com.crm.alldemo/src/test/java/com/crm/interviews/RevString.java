package com.crm.interviews;

public class RevString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="java";
		String rev = "";
		int length=name.length();
		char[] ch=name.toCharArray();
		for(int i=length-1;i>=0;i--) {
			
				rev=rev+name.charAt(i);

	}
		System.out.println(rev);
	}
}