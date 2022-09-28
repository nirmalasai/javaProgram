package StringArrays;

public class PrintBorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n=5;
//		for(int row=1;row<=n;row++) 
//		{
//			for(int col=1;col<=n;col++) 
//			{
//				
//				if(row==col||row+col==n+1||row==1||col==n||col==1||row==n) 
//				{
//					System.out.print("* ");
//					
//				}
//				else{
//					System.out.print("  ");
//				}
//				
//			}
//			System.out.println();
//		}
//		
//	}
//}
// 
		
		int n=5;
		for(int row=n;row!=0;row--) {
			for(int col=1;col<=row;col++) {
				
				System.out.print("* ");
			
		}
			System.out.println();
	}
}
}