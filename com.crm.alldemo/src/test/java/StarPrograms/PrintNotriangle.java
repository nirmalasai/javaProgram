package StarPrograms;

public class PrintNotriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int k=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				k++;
				System.out.print(k+" ");
			}
			System.out.println("");
		}

	}

}
