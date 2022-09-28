package StringPrograms;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="malayalam";
		char[] ch=s.toCharArray();
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);

		if(s.equals(rev)) {
			System.out.println("Given string is palindrome--"+s);
		}else {
			System.out.println("Given is not palindrome--"+s);

		}

	}
}