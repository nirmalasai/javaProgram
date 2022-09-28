package StringPrograms;

public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st="welcome to blr";
		String[] str=st.split(" ");
		for(int i=str.length-1;i>=0;i--) {
			System.out.print(str[i]+" ");
			
		}
	}

}
