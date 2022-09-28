public class Add2Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {3,8,6,2};
		int[] a1= {4,8,9,0,2};
		int count=a.length;
		if(a1.length>a.length) {
			count=a1.length;
			for(int i=0;i<count;i++) {
				try {
					//Here it is going to throw the exception Arrayindexoutof bound we handle it using try catch			
					System.out.println(a[i]+a1[i]);
				}catch(Exception e) {
					if(a.length>a1.length) {
						System.out.println(a[i]);
					}else{
						System.out.println(a1[i]);
					}
				}
				
			}
		}
	}
}


