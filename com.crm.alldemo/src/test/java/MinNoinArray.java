/**
 * To find the minimum no in an array
 * @author sakhi
 *
 */
public class MinNoinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {6,9,3,1};
		int min=a[0];
			for(int i=0;i<a.length;i++) {
				if(a[i]<a[0]) {
					a[0]=a[i];
				}
				
			}
			System.out.println(a[0]);
	}

}
