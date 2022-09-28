package StringPrograms;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s="banglore";
//		String rev="";
//		char[] ch=s.toCharArray();
//		for(int i=s.length()-1;i>=0;i--) {
//			System.out.println(s.charAt(i));
//		}
		
//		String str="Blore";
//		char[] ch=str.toCharArray();
//		for(int i=str.length()-1;i>=0;i--) {
//			System.out.println(ch[i]);
//			
//		String s="nirmala";
//		String rev="";
//		for(int i=s.length()-1;i>=0;i--) {
//			rev=rev+s.charAt(i);
//		}
//			System.out.println(rev);
//		}
		
		
//		String s="Nirmala";
//		char[] ch=s.toCharArray();
//		int count=0;
//		for(char c: ch) {
//			count++;
//		}
//		for(int i=count-1;i>=0;i--) {
//			System.out.println(ch[i]);
//		}
//	
		String s="blore";
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		System.out.println(sb);
		
	
		
	}

}
