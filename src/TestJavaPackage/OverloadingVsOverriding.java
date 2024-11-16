package TestJavaPackage;

class ABC
{
	void m1(int a)
	{
		System.out.println(a);
	}
	
	void m2(int b)
	{
		System.out.println(b);
	}		
}

class XYZ extends ABC
{
	void m1(int a)	//Overriding - Only change in the implementation
	{
		System.out.println(a*a);
	}
	
	void m2(int b)	//Overrided  
	{
		System.out.println(b*b);
	}		
	
	void m2(int a,int b)	//Overloading
	{
		System.out.println(a+b);
	}		
}


public class OverloadingVsOverriding 
{
	
	public static void main(String[] args)
	{
		XYZ xyz = new XYZ();
		xyz.m1(10);	//Overriding XYZ method method
		xyz.m2(20);	//Overloading
		xyz.m2(20, 10);

	}

}
