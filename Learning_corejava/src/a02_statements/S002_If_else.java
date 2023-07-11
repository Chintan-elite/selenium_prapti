package a02_statements;

public class S002_If_else {
	public static void main(String[] args) {
		
		
		int a = 10;
		int b = 10;
		int c = 10;
		
		if(a>b && a>c)
		{
			System.out.println("A is greater");
		}
		else if(b>a && b>c)
		{
			System.out.println("B is greater");
		}
		else if(c>a && c>b)
		{
			System.out.println("C is greater");
		}
		else
		{
			System.out.println("All are equal");
		}
		
		
		
		
		
		
		
	}
}
