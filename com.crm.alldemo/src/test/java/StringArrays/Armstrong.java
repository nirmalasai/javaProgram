package StringArrays;

import java.util.Scanner;

public class Armstrong {

	static int countDigit(int num)
	{
	int count=0;
	while(num>0)
	{
	count++;
	num=num/10;
	System.out.println(num);
	}
	return count;
	}
	static int pow(int n,int p)
	{
	int pw=1;
	while(p>0)
	{
	pw=pw*n;
	p--;
	}
	return pw;
	}
	static boolean isAmstrong(int x)
	{
	int nd=countDigit(x);
	int t=x;
	int sum=0;
	while(t>0)
	{
	int r=t%10;
	sum=sum+pow(r,nd);
	t=t/10;
	}
	if(sum==x)
	return true;
	else
	return false;
	}
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		boolean r=isAmstrong(n);
		if(r)
		System.out.println("Given num is Armstrong");
		else
		System.out.println("Given num is not Armstrong");
		}
		
		
		

	}


