package com.crm.Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set=new HashSet();
		//HashSet set=new HashSet(100,(float)0.85);
		//HashSet<String> set=new Hashset<String>();
		
		//add elements into hashset
		set.add("asd");
		set.add('c');
		set.add(100);
		set.add(true);
		set.add(null);
		//insertion order not preserved
		//wedont have set method
		System.out.println(set);
		
		set.remove("asd");
		System.out.println(set);
		
	
		System.out.println(	set.contains('c'));
		System.out.println(set.isEmpty());
		
		
		for(Object e:set) {
			System.out.println(e);
		}
		
		Iterator i=set.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		

	}

}
