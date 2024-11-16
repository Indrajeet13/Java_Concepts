package TestJavaPackage;

import java.util.Arrays;

public class SortingElementFromArray {

	public static void main(String[] args) 
	{
		int a[] = {100,600,200,500,300};
		
		System.out.println("Before Sorting :");
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);
		
		System.out.println("After Sorting :");
		System.out.println(Arrays.toString(a));
		
	}

}
