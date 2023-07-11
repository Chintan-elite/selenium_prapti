package a06_exception;

class Demo
{
	public void test() throws ClassNotFoundException
	{
		Class.forName("com.Demo");
	}
}

public class E002_CompiletimeException {
	
	
	
	public static void main(String[] args) {
		
		
//		try {
//			
//			Class.forName("com.Demo");
//			
//		} catch (ClassNotFoundException e) {
//			
//			e.printStackTrace();
//		}
		
		Demo d = new Demo();
		try {
			d.test();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
