package practice;

public class P003_Fibbonacci {
	public static void main(String[] args) {
		
		
		int num = 20;
		int a = 0;
		int b = 1;
		System.out.print(a+" "+b);
		for(int i=3;i<=num;i++)
		{
			int c = a+b;
			System.out.print(" "+c);
			a = b;
			b = c;
			
		}
		
		
		
		
	}
}
