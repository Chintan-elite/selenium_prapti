package statements;

import java.util.Scanner;

public class S004_Switch_Case {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter choice");
		int choice = sc.nextInt() ;
		
		switch(choice)
		{
		case 1 : System.out.println("Gujarati");
		break;
		case 2 : System.out.println("Hindi");
		break;
		case 3 : System.out.println("English");
		break;
		default :
			System.out.println("Invalid input");
		}
		
		
		
	}
	
	
}
