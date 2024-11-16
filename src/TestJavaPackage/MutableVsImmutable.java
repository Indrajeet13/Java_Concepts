package TestJavaPackage;

import java.util.Arrays;

public class MutableVsImmutable {

	public static void main(String[] args) 
	{
		//mutable - can change
		
		int a[] = {20,10,30,50,40};
		
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);
		
		System.out.println(Arrays.toString(a));
		
		//Immutable - Cannot change
		String str =new String("Welcome"); 
		
		System.out.println(str); //Welcome
		
		String concatStr = str.concat(" to Automation");
		
		System.out.println(str); //Welcome ----->immutable - we cannot change it
		
		System.out.println(concatStr);

	}

}
