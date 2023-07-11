package a09_collection;

import java.util.ArrayList;
import java.util.Iterator;

public class C001_ArraylistDemo {
	public static void main(String[] args) {
		
		//default size : 10
		//newsize = oldsize * 3/2 + 1 : 10*3/2 + 1 = 16
		ArrayList<String> al = new ArrayList<>();
		al.add("java");
		al.add("selenium");
		al.add("php");
		al.add("Android");
		al.add(null);
		al.add("php");
		
		//al.add(1,"Testing");
		//al.set(1, "testing");
		//al.remove(2);
		System.out.println(al.get(3));
		
		//System.out.println(al.size());
		
//		for(String s : al)
//		{
//			System.out.println(s);
//		}
//		
		
		
		Iterator<String> itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
		
	}
}
