
public class Sumof3Minnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,8,4,9,12};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			//System.out.println(a[i]);

		}
		for(int i=0;i<3;i++) {
			System.out.println(a[i]);
			sum=sum+a[i];
		}
		System.out.println("sum="+sum);

	}
}
