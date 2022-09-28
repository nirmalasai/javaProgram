package com.crm.Collection;

import java.util.Hashtable;

public class HasTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,Object> map=new Hashtable<Integer,Object>();
		map.put(10,"hi");
		map.put(100, 0);
		map.put(102, "bye");
		map.put(105,"bye");
		//map.put(107,null);//not allowed
		//map.put(null,"sgdh");//not allowed
		System.out.println("before removing"+map);
		map.remove(103);
		System.out.println("after removing"+map);
		System.out.println(map.containsKey(102));
		System.out.println(map.get(100));
		map.replace(105,"hello","nirmala");
		System.out.println(map);
	}

}
