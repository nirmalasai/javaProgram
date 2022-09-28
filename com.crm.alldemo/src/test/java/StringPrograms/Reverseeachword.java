package StringPrograms;

public class Reverseeachword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st="Hello to Blore";
		String[] s=st.split(" ");
		String rev;
		for(int i=0;i<s.length;i++)
		{
			String str=s[i];
		
			for(int j=str.length()-1;j>=0;j--) {
				{
					System.out.print(str.charAt(j));
					
				}
				
			}
			System.out.print(" ");
		}
	}

}
