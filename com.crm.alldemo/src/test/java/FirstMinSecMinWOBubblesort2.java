
public class FirstMinSecMinWOBubblesort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {4,8,2,0,6};
		/*int[] a= {2,8,9,4,6};
		int fmin=a[0];
		int smin=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>fmin) {
				if(a[i]!=fmin) {
					smin=fmin;
				}
				fmin=a[i];
			}else 
				if(fmin==smin||smin<a[i]) {
					smin=a[i];
				}

		}
		

		System.out.println(fmin);
		System.out.println(smin);*/
		int fmin=a[0];
		int smin=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<a[0]) {
				smin=fmin;
				fmin=a[i];
			}else if(a[i]<smin)
			{
				smin=a[i];
			}
		}
		System.out.println(fmin);
		System.out.println(smin);
	}

	}


