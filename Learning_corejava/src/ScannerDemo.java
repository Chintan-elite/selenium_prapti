import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a : ");
		int a = sc.nextInt();
		System.out.println("enter value of b : ");
		int b = sc.nextInt();
		System.out.println("Enter your name : ");
		String name = sc.next();
		
		
		
		System.out.println(a+" "+b);
		System.out.println(name);
		
		
	}
}
