
public class PRactice {
	public static void main(String[] args) {
		
		
//		int a = 10;
//		short s = 456;
//		byte b = 20;
//		long l = 45566;
//		
//		float f = 456.233f;
//		double d = 456.2333;
//		
//		char ch = 'A';
//		boolean bool = true;
		
		//datatype casting :
		
	
		//widening //implicite
		int a = 20;  //4bytes
		long b = a;  // 8 byte
		
		//nerrowing //explicite
		long k = 214748365l; // 8 byte
		int l = (int)k;  // 4 byte
		
		System.out.println(k);
		System.out.println(l);
		
		
	}
}
