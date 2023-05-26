package oops;

abstract class Abs
{
	public abstract void display();
	
	public void sample()
	{
		System.out.println("Runing sample");
	}
}

class AbsImpl extends Abs
{

	@Override
	public void display() {
		System.out.println("Runing display...");
		
	}
	
}


public class O011_AbstractDemo {
	public static void main(String[] args) {
		
		//Abs abs = new Abs();
				
		AbsImpl abs = new AbsImpl();
		abs.display();
		abs.sample();
		
	}
}
