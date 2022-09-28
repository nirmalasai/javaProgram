package com.crm.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample
{
	public static void main(String[] args) {
		
		//decleration
	
		
		ArrayList al=new ArrayList();
		
		//ArrayList<Integer> al=new ArrayList<Integer>();
		
		//ArrayList<String> al=new ArrayList<String>();
		
		//List al=new ArrayList();
		
		//add new elements to arraylist
		//add will add the element at the end of the arraylist
		al.add("asd");
		al.add(100);
		al.add("asd");
		al.add('c');
		al.add(12.878);
		System.out.println(al);
		
		//to add the element in the index /in between
		al.add(1,'b');
		System.out.println(al);
		
		//remove the element from the index
		al.remove(2);
		System.out.println(al.size());
		//al.removeAll(al);
		//System.out.println(al);
		al.retainAll(al);
		System.out.println(al);
		//to retrive specific element from the list
		System.out.println(al.get(3));
		
		//to change/replace element
		al.set(2,"python");
		System.out.println(al);
		//checks if the list contains python return true if not false
		System.out.println(al.contains("python"));
		
		System.out.println(al.contains("C++"));
		
		//to check if the list is empty returns true if not present/false if present
		System.out.println(al.isEmpty());
		
		//first method
		//reading elements using forloop
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		//second method using for each
		for(Object i:al) {
			System.out.println(i);
		}
		
		//third method iterator
		Iterator i=al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	
	}

}
