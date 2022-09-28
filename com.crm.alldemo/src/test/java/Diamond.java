
public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=5;
		int n=5;
		for(int i=1;i<n;i++){
		for(int j=i;j<n;j++){
		System.out.print(" ");
		}
		for(int j=1;j<=i;j++){
		System.out.print("* ");
		}
		for(int j=1;j<=i;j++){
		System.out.print("* ");
		}
		System.out.println("");
		}

		for(int i=1;i<=m;i++)
		{
		for(int j=1;j<=i;j++){
		System.out.print("  ");
		}
		for(int j=i;j<m;j++){
		System.out.print("* ");
		}
		for(int j=i;j<=m;j++) {
		System.out.print("* ");
		}
		System.out.println("");
		}
}
}


