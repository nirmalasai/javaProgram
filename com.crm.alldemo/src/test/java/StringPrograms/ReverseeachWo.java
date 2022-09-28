package StringPrograms;

public class ReverseeachWo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st="welcome to blore";
		String[] str=st.split(" ");
		String rev="";
		for(int i=0;i<str.length;i++) {
			String eachword=str[i];
			
			for(int j=eachword.length()-1;j>=0;j--) {
			     System.out.println(eachword.charAt(j));
			     
			}
			
		}
		System.out.println(" ");
		
	}

}
