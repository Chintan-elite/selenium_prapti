package a04_oops;

class P
{
	public void display()
	{
		System.out.println("Runing p class display");
	}
}

class Q extends P
{
	@Override
	public void display() {
		System.out.println("Running q class display");
	}
}

public class O010_MEthodoveriridng {
	public static void main(String[] args) {
		
		Q q = new Q();
		q.display();
		
	}
}
