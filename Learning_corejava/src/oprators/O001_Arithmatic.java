package oprators;

import oops.Modifier;

public class O001_Arithmatic {
	public static void main(String[] args) {
		
		
		double a = 23;
		double b = 10;
		
//		System.out.println(a+b);
//		System.out.println(a-b);
//		System.out.println(a*b);
//		System.out.println(a/b);
//		System.out.println(a%b);
		
		
		System.out.println("Test"+a);
		System.out.println(a+"test");
		System.out.println("Test"+a+b);
		System.out.println(a+b+"Test"+a+b);
		
		
		Modifier md = new Modifier();
		md.a = 20;
		md.name = "aks";
		md.display();
		
	}
}
