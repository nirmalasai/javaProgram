
public class Swappingwithtempvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		int temp=a;
//		temp=a+b;
//		a=temp-a;
//		b=temp-b;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);

	}

}
