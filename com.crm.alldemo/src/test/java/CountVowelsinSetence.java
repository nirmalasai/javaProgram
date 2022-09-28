
public class CountVowelsinSetence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="wtewtjfdngkjdfjfdhgaaafggdhviu";
		char[] ch=s.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				count++;
			}
		}
		System.out.println(count);

	}

}
