package StringPrograms;

import java.util.LinkedHashSet;

public class StringWordOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st="Welcome to to the the new city";
		String[] s=st.split(" ");
		LinkedHashSet<String> hs=new LinkedHashSet<String>();
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
			hs.add(s[i]);
			}
		for(String s1:hs) {
			int count=0;
			for(int i=0;i<s.length;i++) {
				if(s1.equals(s[i])) {
					count++;
				}
			}
			System.out.println(s1+":"+count);
		}
			
		}
		
	}


