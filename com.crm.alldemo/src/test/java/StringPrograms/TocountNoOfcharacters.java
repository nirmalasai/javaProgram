package StringPrograms;

import java.util.LinkedHashSet;

public class TocountNoOfcharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello";
		LinkedHashSet<Character> hs=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) {
			hs.add(s.charAt(i));
		}
		for(Character ch:hs) {
			int count=0;
			for(int i=0;i<s.length();i++) {
				if(ch==s.charAt(i)) {
					count++;
				}
			}
			System.out.println(count);
			
		}
		System.out.println(hs);
		
	}

}
