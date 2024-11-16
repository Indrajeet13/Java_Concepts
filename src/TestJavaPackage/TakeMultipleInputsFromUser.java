package TestJavaPackage;

import java.util.Scanner;

public class TakeMultipleInputsFromUser 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the First Number:\n");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the Second Number:\n");
		int num2 = sc.nextInt();
		
		System.out.println("Addition of Two numbers : "+(num1+num2));
		
		System.out.println("Enter the Integer Number:\n");
		int num3 = sc.nextInt();
		
		System.out.println("Enter the Decimal Number:\n");
		double num4 = sc.nextDouble();
		
		System.out.println("Enter Unknown Value:\n");
		Object value = sc.next();
		
		System.out.println(value);
		
		System.out.println("The Number is : "+num3);
		System.out.println("The Number is : "+num4);
	}
}
