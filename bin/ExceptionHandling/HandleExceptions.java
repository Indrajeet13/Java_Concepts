package ExceptionHandling;

import java.util.Scanner;

public class HandleExceptions {

	public static void main(String[] args) 
	{
		
		System.out.println("Program is started..");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		
		try
		{	
			System.out.println(100/num);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Invalid Data....");
		}
		
		
		System.out.println("\nProgram is completed..");
		System.out.println("Program is exited..");

	}

}
