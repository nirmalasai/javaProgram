package com.crm.interviews;

public class Traingle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=6;
		for(int i=1;i<=6;i++) {
			int p='A';
			for(int j=(n-i);j>=0;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print((char)p++ +" ");
			}
			System.out.println("");
		
		}
		
		
		
		
		
		
		
		
		
		}
	}


