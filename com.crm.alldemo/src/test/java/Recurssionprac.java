
public class Recurssionprac {
	static int n=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="welcome";
		n=s.length()-1;
		reverse(s);

	}
	
	public static void reverse(String s) {
		if(n>=0) {
			System.out.println(s.charAt(n));
			n--;
			reverse(s);
		}
		
		
		
	}

}
