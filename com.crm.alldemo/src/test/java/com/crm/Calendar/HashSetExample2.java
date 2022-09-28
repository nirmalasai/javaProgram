package com.crm.Calendar;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class HashSetExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet even=new HashSet();
		even.add(4);
		even.add(2);
		even.add(6);
		System.out.println(even);
		
		HashSet num=new HashSet();
		//union
		num.addAll(even);
		System.out.println(num);
		
		num.add(10);
		System.out.println(num);
		//intersection
		num.retainAll(even);
		System.out.println(num);
		
		num.containsAll(even);
		System.out.println(num);
		//remove all
		num.removeAll(even);
		System.out.println(num);
		
	}

}
