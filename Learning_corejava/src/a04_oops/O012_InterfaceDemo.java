package a04_oops;

interface I1
{
	public void display();
	
	
}

class InterImpl implements I1
{

	@Override
	public void display() {
		System.out.println("running display");
		
	}
	
}

public class O012_InterfaceDemo {
	public static void main(String[] args) {
		
		InterImpl impl = new InterImpl();
		impl.display();
	}
}
