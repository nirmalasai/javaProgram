
public class FirstLetterUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="welcome to java world";
		String[] arr=s.split(" ");
		for(int i=0;i<arr.length;i++) {
			String word=arr[i];
			word=word.substring(0, 1).toUpperCase()+word.substring(1);
			System.out.print(word+" ");
			
		}

	}

}
