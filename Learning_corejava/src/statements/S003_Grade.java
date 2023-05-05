package statements;

import java.util.Scanner;

public class S003_Grade {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter marks : ");
		int marks = sc.nextInt();
		
		// 90-100 : grade a
		// 70-90 : grade b
		// 50-70 : grade c
		// 35-50 : grade d
		// 1-35 : fail
		// invalid input
		
		
		
		if(marks>90 && marks<=100)
		{
			System.out.println("Grade A");
		}
		else if(marks>70 && marks<=90)
		{
			System.out.println("Grade B");
		}
		else if(marks>50 && marks<=70)
		{
			System.out.println("Grade C");
		}
		else if(marks>30 && marks<=50)
		{
			System.out.println("Grade D");
		}
		else if(marks>0 && marks<=35)
		{
			System.out.println("Fail");
		}
		else
		{
			System.out.println("Invalid input");
		}
		
		
		
		
		
	}
}
