package com.crm.interviews;

public class NoofWordsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="my name is nirmala";
		int count=0;
		String[] a = s.split(" ");
		//System.out.println(a.toString());
				for(int i=0;i<=a.length-1;i++) {
					count=count+1;
				}
				System.out.println(count);
	}

}
