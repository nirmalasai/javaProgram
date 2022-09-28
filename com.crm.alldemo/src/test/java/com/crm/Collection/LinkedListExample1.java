package com.crm.Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LinkedList<String> ll=new LinkedList<LinkedList>();
		LinkedList ll=new LinkedList();
		ll.add(100);
		ll.add("asd");
		ll.add('c');
		ll.add(true);
		System.out.println(ll);
		System.out.println(ll.size());String[] args2 = new String[args.length + 1];
		System.out.println("removed="+ll.remove(2));//index can remove element only using index
		//adding ele in the middle of linked list
		ll.add(3,"nirmala");
		ll.add(1,90);
		System.out.println(ll);
		//retriving the values from ll
		System.out.println(ll.get(1));
		//replace thevalue
		ll.set(2,45);
		System.out.println(ll);
		//contains
		System.out.println(ll.contains("Nirmala"));
		//isempty()
		System.out.println(ll.isEmpty());
		
		//reading objects or elements
		for(int i=0;i<ll.size();i++)
		{
			System.out.println(ll.get(i));
		}
		
		//using foreach
		for(Object e:ll)
		{
			System.out.println(e);
		}
		
		//using iterator
		Iterator i=ll.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		ll.remove(2);
		System.out.println(ll);
		
		ll.add(2,"test");
		System.out.println(ll);
		ll.get(3);
		System.out.println(ll);

	}

}
