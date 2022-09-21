/**
 * To find the first minimum,second minimum,first maximum,and second maximum 
 * @author sakhi
 *
 */
public class FindMinNoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {6,1,0,2};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]);
			
		}
		System.out.println("first min="+a[0]);
		System.out.println("second min="+a[1]);
		System.out.println("first max number="+a[a.length-1]);
		System.out.println("second max number="+a[a.length-2]);
		
	}

}
