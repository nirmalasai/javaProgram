package com.crm.Collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arra[]= {"dog","cat","tiger"};
		System.out.println(arra);
		for(String s:arra) {
			System.out.println(s);
		}
		ArrayList al=new ArrayList(Arrays.asList(arra));
		System.out.println(al);
	}

}
