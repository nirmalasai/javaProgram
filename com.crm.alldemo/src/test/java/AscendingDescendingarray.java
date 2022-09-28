
public class AscendingDescendingarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,8,9,5};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		for(int k=0;k<a.length;k++) {
			System.out.println(a[k]);
		}
		System.out.print("");
		for(int h=a.length-1;h>0;h--) {
			System.out.println(a[h]);
		}
	}

}
