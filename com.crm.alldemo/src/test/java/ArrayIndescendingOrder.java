/**
 * To sort the array in descending order
 * @author sakhi
 *
 */
public class ArrayIndescendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {4,8,12,7};
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]);
		}
	}
}


