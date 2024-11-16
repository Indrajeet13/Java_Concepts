package TestJavaPackage;

public class Greetings {
	
	// No params   No return value-----------------------------------
	
	void m1()
	{
		System.out.println("Hello....");
	}
	
	
	// No Params return value-----------------------------------------
	
	String m2()
	{
		return("Hello how are you");
	}
	
	// Takes Params  	No return Value -------------------------------
	
	void m3(String name, int a)
	{
		System.out.println("Hello "+name);
		System.out.println(a);
	}
	
	
	// Takes Params 	Returns Value----------------------------------
	
	String m4(String name)
	{
		return("Hello "+name);
	}
	
	
}
