package com.crm.interviews;

import java.util.HashSet;
import java.util.LinkedHashSet;

import org.apache.commons.math3.util.MultidimensionalCounter.Iterator;

public class StringDuplicates {

	public static void main(String[] args) {
		char str[] = "geeksforgeeks".toCharArray();
        int n = str.length;
        HashSet<Character> s = new LinkedHashSet(n - 1);
        // HashSet doesn't allow repetition of elements
          for (char x : str)
              s.add(x);
   
          // Print content of the set
          for (char x : s)
              System.out.print(x);
      }
   
		
			
	
	}


