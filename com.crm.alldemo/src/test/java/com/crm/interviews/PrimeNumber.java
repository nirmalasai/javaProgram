package com.crm.interviews;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=8;
		int count=0;
		if(num>1) {
		for(int i=1;i<=num;i++) {
		if(num%i==0) {
			count++;
			System.out.println(i);
		}
	}
		if(count==2) {
			System.out.println("prime");
		}else
		{
			System.out.println("not prime");
		}
	
	}
}
}


