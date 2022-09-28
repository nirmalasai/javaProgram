package StringArrays;

public class MainOverload {

	public static void main(String[] args) 
	{
		System.out.println("iam main");
		main("asd");
		main(10);
	}
		
		public static void main(String name)
		{
			System.out.println("name");
		}
		
		public static void main(int no)
		{
			System.out.println("no");
			
		}
		

	}


