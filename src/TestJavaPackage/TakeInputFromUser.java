package TestJavaPackage;

import java.util.Scanner;

public class TakeInputFromUser {

	public static void main(String[] args) 
	{
		//int num = 20; // Hardcoded value
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Integer Number:\n");
		int num = sc.nextInt();
		
		System.out.println("Enter the Decimal Number:\n");
		double num1 = sc.nextDouble();
		
		System.out.println("Enter the City:");
		String city = sc.next();
		
		System.out.println("The Number is : "+num);
		System.out.println("The Number is : "+num1);
		System.out.println("The City is : "+city);
		
	}

}
