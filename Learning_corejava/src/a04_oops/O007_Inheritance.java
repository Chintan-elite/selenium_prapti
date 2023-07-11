package a04_oops;

//base, parent, super
class A
{
	int a = 10;	
	public void display()
	{
		System.out.println("Class A display methosd calling...");
	}
}


//derived, child, sub
class B extends A
{
	int b = 20;
	public void sample()
	{
		System.out.println("Class B sample");
		System.out.println(b+" "+a);
	}
}


public class O007_Inheritance {
	public static void main(String[] args) {
		
		B b = new B();
		b.sample();
		b.display();
	}
}
