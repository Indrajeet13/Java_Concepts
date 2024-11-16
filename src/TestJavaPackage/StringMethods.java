package TestJavaPackage;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) 
	{
		//String s = "Welcome";
		//String s = new String("Welcome");	//Second approch
		
		//length() - Returns length of a string (number of character)----------------------------------------------
		
		String s = "Welcome";
		
		int l = s.length();
		
		System.out.println(l);
		
		System.out.println(s.length());
		
		System.out.println("Welcome".length());
		
		// Concat method--------------------------------------------------------------------------------------------

		
		String s1="Welcome";
		String s2=" to Cyncly";
		String s3=" Pune";
		
		System.out.println(s1+s2);
		
		System.out.println(s1.concat(s2));
		
		System.out.println(s1+s2+s3); //Three stings concat
		
		System.out.println(s1.concat(s2).concat(s3));
		
		System.out.println("Welcome"+" to Cyncly");

		System.out.println("Welcome".concat(" to Cyncly"));
		
		
		
		//trim method------------------------------------------------------------------------------------------------
		
		String s4 = "    Welcome   ";
		
		System.out.println(s4.trim());
		
		
		//charAt() - returns a character from a string based on index------------------------------------------------
		
		//index starts  from 0
		
		System.out.println(s1.charAt(3));
		System.out.println(s1.charAt(1));
		
		
		//contains()- returns true or false ------------------------------------------------------------------------------
		
		System.out.println(s1.contains(s3)); // false
		System.out.println(s1.contains("Wel")); //true
		System.out.println(s2.contains(" to ")); //true
		
		
		// equals(), equalsIgnoreCase() - compare strings---------------------------------------------------------------
		
		String s5 = "Welcome";
		
		System.out.println(s1==s5);	//true
		System.out.println(s1.equals(s5)); //true
		System.out.println(s1.equals("welcome")); //false due to case sensitivity
		
		System.out.println(s1.equalsIgnoreCase("welcome"));	//true - equalsIgnoreCase
		
		//replace() - replace single/multiple(sequence) of characters in a string-------------------------------------------
		
		s = "welcome to selenium java selenium python and selenium c#";
		
		System.out.println(s.replace('e', 'X'));
		
		System.out.println(s.replace("selenium", "PlayWright"));
		
		
		
		//substring() - extract substring from the main string-----------------------------------------------------------------
		
		
		s = "Selenium";
		
		System.out.println(s.substring(2));
		System.out.println(s.substring(0, 3));
		
		
		//toUpperCase(), toLowerCase()----------------------------------------------------------------------------------------
		
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		
		// split() - Split the string into multiple parts based on delimeter
		
		s = "abc@gmail.com";
		
		String a[] = s.split("@");
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		
		System.out.println(Arrays.toString(a));
		
		//example 1
		
		String amount = "$15,20,55";
		System.out.println(amount.replace("$", "").replace(",", ""));
		
		
		//example 2
		
		s="abc,123@xyz";
		
		String arr1[] = s.split(",");
		System.out.println(Arrays.toString(arr1));	//[abc, 123@xyz]
		
		String arr2[] = arr1[1].split("@");
		System.out.println(Arrays.toString(arr2));	//[123, xyz]
		
		System.out.println(arr1[0]); //abc
		System.out.println(arr2[0]); //123
		System.out.println(arr2[1]); //xyz
		
		
		//example 3
		
		
		s="abc 123";
		String ar[] = s.split(" ");
		System.out.println(Arrays.toString(ar)); //[abc 123]
		
		
		// Note - * ^ % & ( ) :you cannot use as delimeter
		
		
		//example 4
		
		String name = "John Kenedy";
		System.out.println(name.contains("john")); //false
		
		System.out.println(name.replace('J', 'j').contains("john")); //true
		
		System.out.println(name.toLowerCase().contains("john")); //true
	}

}
