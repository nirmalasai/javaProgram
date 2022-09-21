package com.crm.interviews;

public class ToaddDigits2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="sgd6324bdhfs7834";
		char[] ch=str.toCharArray();
		int sum=0;
		for(int i=0;i<ch.length;i++) {
			if(str.charAt(i)>='0'&& str.charAt(i)<='9') {
				System.out.println(ch[i]);
				sum=sum+str.charAt(i)-'0';
			}
		}
		
		System.out.println(sum);
	}

}
