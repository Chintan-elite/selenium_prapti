package impclasses;

public class I002_StringMthodas {
	public static void main(String[] args) {
		
		
		String s = "Sun rises in East";
		String s1 = "hello";
		
		System.out.println(s.length());
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.charAt(6));
		System.out.println(s.indexOf('n'));
		System.out.println(s.lastIndexOf('n'));
		System.out.println(s.endsWith("st"));
		System.out.println(s.startsWith("abc0"));
		System.out.println(s.contains("in"));
		System.out.println(s.replace('s', 'O'));
		System.out.println(s.equals(s1));
		System.out.println(s.concat(s1));
		
		System.out.println("*************************");
		
		String ar[] = s.split(" ");
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
		
		System.out.println("************************");
		
		char ch[] = s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
		
		System.out.println("*************************");
		
		byte b[] = s.getBytes();
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
		
		
		
		
		
	}
}
