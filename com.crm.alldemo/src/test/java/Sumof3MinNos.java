
public class Sumof3MinNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {4,9,2,0,5,7};
		int sum=0;
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
//		System.out.println("firstmin="+a[0]);
//		System.out.println("second min="+a[1]);
//		System.out.println("third min="+a[2]);
//		sum=a[0]+a[1]+a[2];
//		System.out.println("sum="+sum);
		for(int i=0;i<3;i++) {
			sum=sum+a[i];
		}
		System.out.println("sum="+sum);
	}

}
