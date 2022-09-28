package com.crm.Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al=new ArrayList();
		al.add('X');
		al.add('H');
		al.add('J');
		al.add('U');
		al.add('T');
		al.add('S');
		al.add('X');
		
		//add all is used to copy one set of objects to another same set of objects(duplicate
		ArrayList all=new ArrayList();
		all.addAll(al);
		System.out.println(all);
		
		//al.retainAll(all);
		//System.out.println(al);
		//removing all 
		all.removeAll(al);
		System.out.println("removed="+all);
		
		
		//to sort the arraylist we use the method from collections class as we dont have direct method in arrylist
		System.out.println(al);
		Collections.sort(al);
		System.out.println("After sorting="+al);
		
		//to sort in decsending order
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("descending order="+al);
		
		//shuffling from collections
		Collections.shuffle(al);
		System.out.println("elements after shuffling="+al);
		
		


	}

}
