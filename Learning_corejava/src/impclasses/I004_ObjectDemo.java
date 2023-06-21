package impclasses;

class A
{
	@Override
	public String toString() {
		return "hello";
	}
}

class B extends A
{
	
}

class C extends B
{
	
}

public class I004_ObjectDemo {
	public static void main(String[] args) {
		
		B b = new B();
		System.out.println(b);
		
		A a = new A();
		System.out.println(a);
	}
}
