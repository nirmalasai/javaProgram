package com.crm.alldemo;

public class OccuranceWO{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String st = "welcome";
		int n=st.length();
		char ch[]=st.toCharArray();
		for (int i=0;i<n ;i++ )
		{
		int count=1;
		for (int j=i+1;j<n ;j++ )
		{
		if(ch[i]==ch[j])
		{
		count++;
		int k=j;
		while (k<n-1)
		{ 
		ch[k]=ch[k+1];
		k++;
		}
		n--;
		j--;
		}
		}
		System.out.println(ch[i]+" occurred "+count+" times");
		}
		String nst=" ";
		for (int i=0;i<n ;i++ )
		{
		nst=nst+ch[i];
		}
		System.out.println(nst);
	}

}
