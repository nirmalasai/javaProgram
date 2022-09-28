package com.crm.interviews;

public class OddUpperEvenLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String("java hello world");
		String[] words = s.split(" ");
		//System.out.println(Arrays.toString(s1));
		String reverseString="";
		for(int i=0;i<words.length;i++) {
			String word=words[i];
			String reverseword="";
			if(i%2==0) {
			word=word.toLowerCase();
			}else {
				word=word.toUpperCase();
			
			}
			for(int j=word.length()-1;j>=0;j--) {


				reverseword=reverseword+word.charAt(j);
			}
			

			reverseString=reverseString+reverseword+" ";


		}
		System.out.println(reverseString);
	}

}

