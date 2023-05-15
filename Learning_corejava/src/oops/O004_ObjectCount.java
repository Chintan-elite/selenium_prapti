package oops;

class Demo
{
	static int count = 0;
	Demo()
	{
		count++;
		System.out.println("const calling");
		System.out.println("callig : "+count);
	}
}
public class O004_ObjectCount {
	public static void main(String[] args) {
		
		Demo d1 = new Demo();
		Demo d2 = new Demo();
	
		
		
	}
}
