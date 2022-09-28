package com.crm.interviews;

public class CountChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="this is my hometown";
		
		char ch[]=s.toCharArray();
		int count=0;
		for(int i=0;i<=ch.length-1;i++) {
			count=count+1;
		}
		System.out.println(count);

	}

}
