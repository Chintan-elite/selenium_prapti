package a05_impclasses;

public class I001_StringDemo {
	public static void main(String[] args) {
		
//		//String literal
//		String str = "hello";
//		
//		//by creating object
//		String s = new String("java");
//		
//		//System.out.println(str+" "+s);
//		
//		
//		String s1 =  str.concat("test");
//		System.out.println(s1);
		
		
		String s1 = "Hello";
		String s2 = "java";
		String s3 = "Hello";
		
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1==s3);
		
		System.out.println("**************************");
		
		String str1 = new String("Hello");
		String str2 = new String("java");
		String str3 = new String("Hello");
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1==str3);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
