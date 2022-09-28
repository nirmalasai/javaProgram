package com.crm.Collection;

import java.util.*;

public class LinkedListExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll=new LinkedList();
//		ll.add(100);
//		ll.add("name");
//		ll.add(10.99);
//		ll.add('c');
//		ll.add(null);
//		ll.add(true);
		
		ll.add('A');
		ll.add('B');
		ll.add('P');
		ll.add('C');
		
		LinkedList l=new LinkedList();
		l.addAll(ll);
		System.out.println(l);
		
		Collections.sort(l);
		System.out.println(l);
		
		Collections.sort(l,Collections.reverseOrder());
		System.out.println(l);
		
		Collections.shuffle(l);
		System.out.println(l);
		l.removeAll(ll);
		System.out.println(l);
	}

}
