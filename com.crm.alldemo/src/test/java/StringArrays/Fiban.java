package StringArrays;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class Fiban {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstnumber=0;
		int secondnumber=1;
		int res=0;
		int n=10;
		for(int i=1;i<n;i++) {
			     System.out.print(firstnumber+",");
				 res=firstnumber+secondnumber;
				 firstnumber=secondnumber;
				 secondnumber=res;
		}
		
		System.out.println(res);
	}

}
