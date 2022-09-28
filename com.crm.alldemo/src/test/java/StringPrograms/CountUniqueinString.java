package StringPrograms;

import java.util.LinkedHashSet;

public class CountUniqueinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="testingeetiuy";
		LinkedHashSet<Character> hs=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) {
			hs.add(s.charAt(i));
		}
		for(Character c:hs) {
			int count=0;
			for(int i=0;i<s.length();i++) {
				if(c==s.charAt(i) && count!=1) {
					count++;
				}
			}
			System.out.println(c+"..."+count);
		}
	}

}
