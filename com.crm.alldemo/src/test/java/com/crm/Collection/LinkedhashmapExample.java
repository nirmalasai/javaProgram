package com.crm.Collection;

import java.util.LinkedHashMap;

public class LinkedhashmapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap map=new LinkedHashMap();
		map.put(10, "hi");
		map.put(11, 123);
		map.put(null,"hello");
		map.put(null, "nirmala");
		map.put(34, 567);
		map.put(111, null);
		map.put(112, null);
		System.out.println(map);
		map.remove(11);
		System.out.println(map);
		map.replace(10, "modified");
		System.out.println(map);
		
		
		
	}

}
