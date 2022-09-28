package com.crm.Collection;

import java.util.Stack;

public class Stackexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s=new Stack();
		s.push(100);
		s.push("abc");
		s.push(true);
		System.out.println(s);
		s.pop();
		System.out.println(s);
		s.pop();
		System.out.println(s);
	}

}
