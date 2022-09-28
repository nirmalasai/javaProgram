
public class MaxFirstandSecondWOBubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,8,6,0,4};
		int fmax=a[0];
		int smax=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>fmax) {
				smax=fmax;
				fmax=a[i];
				
			}
			else
				if(a[i]>smax) {
					smax=a[i];
				}
		}
		
		System.out.println(fmax);
		System.out.println(smax);
	}

}
