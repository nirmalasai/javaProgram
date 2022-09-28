
public class Arrayinternal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		int count=0;
		for(int i=0;i<a.length;i++) {
			int b[]=a[i];
			int sum=0;
			int c=0;
			int sum1;
			int greater[];
			for(int j=0;j<b.length;j++) {
				int k=b[j];
				sum=sum+k;
				count++;
				sum1=sum;
			}
			System.out.println(sum);
			}
		}
}
