package TestJavaPackage;

import java.util.Arrays;

public class SortingStringUsingArray {

	public static void main(String[] args) 
	{
		String s[] = {"WagonR", "Alto", "Nano", "Creata"};
		
		System.out.println("Before Sorting :");
		System.out.println(Arrays.toString(s));
		
		Arrays.sort(s);
		
		System.out.println("After Sorting :");
		System.out.println(Arrays.toString(s));
		
	}

}
