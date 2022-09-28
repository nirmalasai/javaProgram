package com.crm.interviews;

import java.util.ArrayList;
import java.util.Arrays;

public class ToReverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String("java hello world");
		String[] words = s.split(" ");
		//System.out.println(Arrays.toString(s1));
		String reverseString="";
		for(int i=0;i<words.length;i++) {
			
			
			String word=words[i];
			String reverseword="";
			for(int j=word.length()-1;j>=0;j--) {
				reverseword=reverseword+word.charAt(j);
			}
			
			reverseString=reverseString+reverseword+" ";

				
			}
		System.out.println(reverseString);
		}
		
	}


