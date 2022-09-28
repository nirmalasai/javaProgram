
public class fibusingiterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0;
		int n2=1;
		int sum=0;
		for(int i=0;i<50;i++) {
		sum=n1+n2;
		if(sum%3==0 || sum%5==0) {
	    System.out.println(sum);
		}
		n1=sum;
		sum=n2;
		}
		
	}
	}

	


