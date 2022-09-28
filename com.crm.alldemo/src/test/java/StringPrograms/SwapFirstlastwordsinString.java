package StringPrograms;

public class SwapFirstlastwordsinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st="welcome to blore new city";
		String[] s=st.split(" ");
		String temp=s[0];
		s[0]=s[s.length-1];
		s[s.length-1]=temp;
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
			
		}
	}

}
