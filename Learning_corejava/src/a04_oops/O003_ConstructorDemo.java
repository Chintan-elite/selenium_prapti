package a04_oops;

class Emp
{
	Emp()
	{
		System.out.println("constructor called...");
	}
	
	Emp(String name)
	{
		System.out.println("called by :"+name);
	}
	
	Emp(int a)
	{
		System.out.println(a);
	}
	
	String name;
	String email;
	String dept;
	
	Emp(String name1, String email1, String dept1)
	{
		name = name1;
		email = email1;
		dept = dept1;
	}
	
	public void display()
	{
		System.out.println(name+" "+email+" "+dept);
	}
	
	
	
}

public class O003_ConstructorDemo {
	public static void main(String[] args) {
		
//		Emp e = new Emp();
//		Emp e1 = new Emp("Papti");
//		Emp e2 = new Emp(10);
//		
		
		Emp e1 = new Emp("Test","test@gmail.com","java");
		e1.display();
		
		Emp e2 = new Emp("Sample","sample@gmail.com","Testing");
		e2.display();
	}
}
