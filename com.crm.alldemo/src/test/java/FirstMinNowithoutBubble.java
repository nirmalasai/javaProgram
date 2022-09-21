
public class FirstMinNowithoutBubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {9,2,6,8,10};
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<a[0]) {
				a[0]=a[i];
			}
		}
		System.out.println(a[0]);
	}

}
