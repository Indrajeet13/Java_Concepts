package TestJavaPackage;

import java.util.Scanner;

public class readingAndWritingDataIntoArray {

	public static void main(String[] args) 
	{
		int a[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter a Value for postion "+i+" : ");
			a[i]=sc.nextInt();
		}
		
		System.out.println("The Array is :");
		for(int x:a)
		{
			System.out.print(x);
		}
	}

}
