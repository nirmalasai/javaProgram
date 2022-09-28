package StringArrays;

import java.util.Scanner;

public class Sperating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence");
		String st=sc.nextLine();
		char[] ch=st.toCharArray();
		int lc=0;
		int uc=0;
		int spc=0;
		int dc=0;
		int sp=0;
		System.out.println(ch[0]);
		for(int i=0;i<ch.length;i++) {
			
			if(ch[i]==97) {
				uc++;
			}
		}
//		for(int i=0;i<ch.length;i++) {
//		if(ch[i]>=65&&ch[i]<=90) {
//			uc=uc++;
//		}
//		else if(ch[i]>=97&&ch[i]<=122) {
//				lc=lc++;
//		}
//		else if(ch[i]>=48&&ch[i]<=57)
//		{
//			dc=dc++;
//		}
//		else  {
//			if(ch[i]==' ') 
//			spc=spc++;
//		else 
//			sp=sp++;
//		
//		}
		System.out.println(uc);
//		System.out.println(lc);
//		System.out.println(dc);
//		System.out.println(spc);
//		
	}		
	

	}

