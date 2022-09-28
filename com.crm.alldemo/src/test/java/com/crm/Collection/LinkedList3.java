package com.crm.Collection;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll=new LinkedList();
				ll.add("dog");
				ll.add("cat");
				ll.add("horse");
				
				System.out.println(ll);
				
		//to use linkedlist special methods
				ll.addFirst("monkey");
				ll.addLast("Gorilla");
				System.out.println(ll);
				
				Collections.sort(ll);
				System.out.println(ll);
				
				ll.removeFirst();
				System.out.println(ll);
				ll.removeLast();
				System.out.println(ll);
				
				ll.add(2,"cat");
				System.out.println(ll);
				ll.removeFirstOccurrence("cat");
				System.out.println(ll);
				
				
	}		

}
