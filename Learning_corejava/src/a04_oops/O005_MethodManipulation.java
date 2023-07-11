package a04_oops;

class Calc
{
	public void sample()
	{
		System.out.println("Running sample method...");
	}
	
	public void add(int a, int b)
	{
		int r = a+b;
		System.out.println("Additon is : "+r);
	}
	
	public int square(int a)
	{
		int sq= a*a;
		return sq;
	}
	
	public String display()
	{
		return "Test";
	}
	
	public void arrayAdd(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum = sum + a[i];
		}
		System.out.println("Sum of array is : "+sum);
	}
	
	
	
}

public class O005_MethodManipulation {
	public static void main(String[] args) {
		
		Calc c = new Calc();
		c.sample();
		c.add(10, 20);
		c.add(20, 30);
		int sq = c.square(5);
		System.out.println("square is : "+sq);
		String name = c.display();
		System.out.println(name);
		
		int a[] = {10,20,30,40,50,60,70};
		c.arrayAdd(a);
		int b[] = {10,60,52,63,4,9};
		c.arrayAdd(b);
		
	}
}
