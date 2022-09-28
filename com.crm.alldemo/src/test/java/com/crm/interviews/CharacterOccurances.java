package com.crm.interviews;

public class CharacterOccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "gfdsasgfqqqrrttt";
		char char1[]=s.toCharArray();
		
		int count=0;
		for(int i=0;i<=char1.length-1;i++) {
		if(s.charAt(i)=='q') {
			count++;
		}
			
		}
		System.out.println(count);
		

	}

}
