/**
 * To sort array in ascending order
 * @author sakhi
 *
 */
public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {6,5,3,9};
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
			
			
			if(a[i]>a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			
			}
		}
			System.out.println(a[i]);
	}

}
}
