package a04_oops;

class Calc1
{
	public void add(int a, int b)
	{
		int r = a+b;
		System.out.println("Addition is : "+r);
	}
	
	public void add(int a, int b, int c)
	{
		int r = a+b+c;
		System.out.println("Addition is : "+r);
	}
	
	public void add(int a, double b)
	{
		double r = a+b;
		System.out.println("Addition is : "+r);
	}
}

public class O009_Methodovrloading {
	public static void main(String[] args) {
		
		Calc1 calc = new Calc1();
		calc.add(10,20);
		calc.add(20, 30, 512);
		calc.add(10, 20.56);
	}
}
