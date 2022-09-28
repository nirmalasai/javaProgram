package StringPrograms;

import java.util.LinkedHashSet;

public class StringDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello";
		LinkedHashSet<Character> hs=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) {
			hs.add(s.charAt(i));
			
		}
		//System.out.println(hs);
		for(Character ch:hs) {
			System.out.println(ch);
		}
	}

}
