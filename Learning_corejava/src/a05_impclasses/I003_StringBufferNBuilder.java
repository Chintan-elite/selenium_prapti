package a05_impclasses;

public class I003_StringBufferNBuilder {
	public static void main(String[] args) {
		
		//syncronised
		double startTime = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("Hello");
		for(int i=1;i<=10000000;i++)
		{
			sb.append("Java");
		}
		//System.out.println(sb);
		double endTime = System.currentTimeMillis();
		
		
		//async
		double startTime1 = System.currentTimeMillis();
		StringBuilder sb1 = new StringBuilder("Hello");
		for(int i=1;i<=10000000;i++)
		{
			sb1.append("Java");
		}
		//System.out.println(sb1);
		double endTime1 = System.currentTimeMillis();
		
		System.out.println("Time takne by buffer : "+(endTime-startTime));
		System.out.println("Time takne by builder : "+(endTime1-startTime1));
		
		
	}
}
