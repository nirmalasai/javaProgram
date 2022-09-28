
public class ReverseString {
	public static void main(String[] args) {
		{
			String s ="Nirmala";
			char[] ch=s.toCharArray();	
			String rev="";
			for(int i=ch.length;i>=0;i--) {
				rev=rev+s.charAt(i);
			}
			System.out.println(rev);
		}
	}

}
