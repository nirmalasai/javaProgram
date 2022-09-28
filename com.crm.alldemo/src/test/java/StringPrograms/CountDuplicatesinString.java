package StringPrograms;

import java.util.LinkedHashSet;

public class CountDuplicatesinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Testing";
		String ss=s.toLowerCase();
		LinkedHashSet<Character> hs=new LinkedHashSet<Character>();
		for(int i=0;i<ss.length();i++) {
			hs.add(ss.charAt(i));
		}
		for(Character c:hs) {
			int count=0;
			for(int i=0;i<ss.length();i++) {
				if(c==ss.charAt(i)) {
					count++;
				}
			}
			System.out.println(c+"....."+count);
		}
	}

}
