package StringPrograms;

import java.util.LinkedHashSet;

public class Countvowelsbyremvingduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="testyantra";
		char[] ch=s.toCharArray();
		LinkedHashSet<Character> hs=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++){
			hs.add(s.charAt(i));
		}
		int count=0;
		for(Character c:hs)
		{
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				count++;
			}
		}
		System.out.println(hs+".."+count);
	}

}
