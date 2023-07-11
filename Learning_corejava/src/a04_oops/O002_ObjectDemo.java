package a04_oops;

class Student
{
	String name;
	String email;
	static String clg;
	
	public void display()
	{
		System.out.println(name+" "+email+" "+clg);
	}
	
	
}

public class O002_ObjectDemo {
	public static void main(String[] args) {
		
		Student.clg="DSTC";
		
		Student s1 = new Student();
		s1.name="Prapti";
		s1.email="p@gmail.com";
		s1.display();
		
		Student s2 = new Student();
		s2.name="Purva";
		s2.email="purva@gmail.com";
		s2.display();
		
		
		
		
		
	}
}
