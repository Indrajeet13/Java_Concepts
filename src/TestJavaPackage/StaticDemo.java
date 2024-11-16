package TestJavaPackage;

public class StaticDemo 
{
	
	static int a=10;	//static varibale
	int b = 20;		//non static variable
	
	static void m1()	//static method
	{
		System.out.println("this is static method...");
	}
	
	void m2()	//non static methods
	{
		System.out.println("this is non-static method...");
	}
	
	void m()	//non static method calling directly other static and non-static stuff  
	{
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}

	public static void main(String[] args) 
	{
	
	//1) static methods can access static stuff directly
		
		System.out.println(a);	//static methods directly access in static method
		m1();
		
		//System.out.println(b);	// cannot access, b is non static
		//m2();		// cannot access, m2() is non static
	
		
	//2) static method can non-static stuff through object
		StaticDemo sd = new StaticDemo();
		System.out.println(sd.b);
		sd.m2();
		
		
		
	//3) non static methods can access everything directly	
		System.out.println("---------------");
		sd.m();
		
	}

}
