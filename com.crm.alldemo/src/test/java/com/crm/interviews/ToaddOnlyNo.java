package com.crm.interviews;

public class ToaddOnlyNo {

		
		public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String a="11fgghhh,,656744dfg";
		char[] ch=a.toCharArray();
		int count =0;
		int sum =0;
		for(int i=0;i<ch.length-1;i++) {
			if(Character.isDigit(ch[i]))
			{
				System.out.println("digits in string="+ch[i]);
				System.out.println();
				int a1=Integer.parseInt(String.valueOf(ch[i]));
				sum=sum+a1;
				//sum=sum+ch;
				count++;
				
				
			}
		}
		System.out.println("count="+count+"---"+sum);

	}

}
