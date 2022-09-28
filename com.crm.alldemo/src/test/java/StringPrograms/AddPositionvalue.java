package StringPrograms;

import java.util.LinkedHashSet;

public class AddPositionvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="tyss";
		LinkedHashSet<Character> hs=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) {
			hs.add(s.charAt(i));
		}
		for(Character c:hs) {
			int count=0;
			int sum=0;
			for(int i=s.length()-1;i>=0;i--) {
				if(c==s.charAt(i)) {
					System.out.println(hs+"----"+(i+1)+""+"position");
					//sum=(sum+(i+1))-'0';
					//sum=sum+i;
					//System.out.println(sum);
					break;
				}
				
			}
			System.out.println(sum);
		}
		
		
	}

}
