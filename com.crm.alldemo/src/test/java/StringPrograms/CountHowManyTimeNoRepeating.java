package StringPrograms;

import java.util.LinkedHashSet;

public class CountHowManyTimeNoRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {4,6,9,3,2,1,2,1};
		LinkedHashSet<Integer> hs=new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++) {
			hs.add(a[i]);
		}
		for(Integer b:hs) {
			int count=0;
			for(int i=0;i<a.length;i++) {
				if(b==a[i]) {
					count++;
				}
			}
			System.out.println(b+" is repeated>>>"+count);
		}
		

	}

}
