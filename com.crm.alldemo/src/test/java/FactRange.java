import java.util.Scanner;

public class FactRange {
	static int fact(int n) {
		int fact=1;
		while(n>0) {
			fact=fact*n;
			n--;
		}
		return fact;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int k=sc.nextInt();
		for(int i=1;i<=k;i++) {
		System.out.println(fact(i));
		}
	}

}
