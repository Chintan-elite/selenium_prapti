package a09_collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class C002_HashsetDemo {
	public static void main(String[] args) {
		
		
		HashSet<String> set = new HashSet<>();
		set.add("java");
		set.add("php");
		set.add("android");
		set.add("java");
		
		for(String s: set)
		{
			System.out.println(s);
		}
		
		System.out.println("***********************");
		
		
		LinkedHashSet<String> set1 = new LinkedHashSet<>();
		set1.add("java");
		set1.add("php");
		set1.add("android");
		set1.add("java");
		
		for(String s: set1)
		{
			System.out.println(s);
		}
		
		System.out.println("***********************");
		
		
		TreeSet<String> set2 = new TreeSet<>();
		set2.add("java");
		set2.add("php");
		set2.add("android");
		set2.add("java");
		
		for(String s: set2)
		{
			System.out.println(s);
		}
		
	}
}
