package exception;

public class E001_ExceptionDemo {
	public static void main(String[] args) {
		
		
		System.out.println("program started...");
		
		try
		{
			int i =0;
			int j  = 10/i;
			System.out.println(j);
			
//			int a[] = new int[5];
//			a[10] = 50;
			
			
		} 
//		catch (ArithmeticException e) 
//		{
//			e.printStackTrace();
//		}
//		catch(ArrayIndexOutOfBoundsException e)
//		{
//			e.printStackTrace();
//		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Program ended...");
		
		
		
		
		
	}
}
