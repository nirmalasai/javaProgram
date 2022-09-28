package com.crm.collectionexample;

public class Maxof2Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {34,89,564,890,12};
		int max1=arr[0];
		int max2=arr[1];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max1) {
				max2=max1;
				max1=arr[i];
			
			}
		}
			System.out.println(max1+","+max2);
	}

}
