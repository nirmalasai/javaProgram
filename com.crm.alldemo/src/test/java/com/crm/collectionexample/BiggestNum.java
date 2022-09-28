package com.crm.collectionexample;

public class BiggestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar[]= {23,87,45,987,90};
		int max=ar[0];
		int index=0;
		int i=0;
		for(;i<ar.length;i++) {
			if (ar[i]>max) {
				int temp=ar[i];
				max=temp;
				index=i;
			}
			
			
		}
		System.out.println("index="+index);	
		System.out.println("biggest no"+max);
		

	}

}
