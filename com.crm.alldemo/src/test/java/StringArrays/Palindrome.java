package StringArrays;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		int givennumber=number;
		int rev=0;
		while(number!=0)
		{
			rev=rev*10+number%10;
			number=number/10;
		}
		System.out.println(rev);
		if(rev==givennumber) {
			System.out.println("entered number is palindrome");
		}else {
			System.out.println("Entered number is not a palindrome");	
			}
		}
	}


