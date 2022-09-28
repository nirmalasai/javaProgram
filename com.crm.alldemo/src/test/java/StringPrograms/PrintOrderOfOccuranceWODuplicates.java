package StringPrograms;

import java.util.LinkedHashSet;

public class PrintOrderOfOccuranceWODuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Testing";
		LinkedHashSet<Character> hs=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) {
			hs.add(s.charAt(i));
		
		}
		for(Character c:hs) {
			for(int i=0;i<s.length();i++) {
			if(c==s.charAt(i)) {
				System.out.println(c+"..."+(i+1)+"<<<position");
				break;
			}
			}
		}
	}

}
