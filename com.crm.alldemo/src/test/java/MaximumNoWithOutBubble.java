
public class MaximumNoWithOutBubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {3,8,9,10,7};
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>a[0]) {
				a[0]=a[i];
			}
		}
		System.out.println(a[0]);

	}

}
