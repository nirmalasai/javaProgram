package StringPrograms;

import java.util.LinkedHashSet;

public class CountNoofDuplicateNoinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   int[] a= {2,8,5,2,8,2,7};
	   LinkedHashSet<Integer> hs=new LinkedHashSet<Integer>();
	   for(int i=0;i<a.length;i++) {
		   hs.add(a[i]);
	   }
	   for(Integer b:hs) {
		   int count=0;
		   //int var=0;
		   for(int i=0;i<a.length;i++) {
			   if(b==a[i]) {
				 
				 count++;   			   
		   }
			   
	   }
		   if(count>1) {
			   System.out.println(count);
		   }
	   //System.out.println(count);
	   

	}
	}
}
