package StringPrograms;

import java.util.LinkedHashSet;

public class CountDuplicatewords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st="Hello welcome to to city city blore";
		String[] s=st.split(" ");
		LinkedHashSet<String> hs=new LinkedHashSet<String>();
		for(int i=0;i<s.length;i++) {
			hs.add(s[i]);
			
		}
		for(String str:hs) {
			int count=0;
			for(int i=0;i<s.length;i++) {
				if(str.equals(s[i])) {
					count++;
				}
			}
			if(count>1) {
				System.out.println(str+"    "+count);
			}
		}
		
	}

}
