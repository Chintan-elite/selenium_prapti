package impclasses;

public class I001_StringDemo {
	public static void main(String[] args) {
		
		//String literal
		String str = "hello";
		
		//by creating object
		String s = new String("java");
		
		//System.out.println(str+" "+s);
		
		
		String s1 =  str.concat("test");
		System.out.println(s1);
		
	}
}
