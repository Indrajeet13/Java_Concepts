package AccessModifiers;

public class Test1 
{
	
	//Private ---------------------------------------
	
//	private int x = 100;	//Access only within  a class - private 
//	
//	private void m1()	//Access only within  a class - private 
//	{
//		System.out.println("This is m1 method");
//	}
	
	
	//Default ---------------------------------------
	
//	int x = 100;	//Access within a package - default
//	
//	void m1()	//Access within a package - default
//	{
//		System.out.println("This is m1 method");
//	}
	
	//Protected -----------------------------------------
	
//	protected int x = 100;	//Outside of the package using inheritance
//	
//	protected void m1()	//Access within a package directly, and access outside of the package using inheritance
//	{
//		System.out.println("This is m1 method");
//	}
	
	
	//Public ----------------------------------------------
	
	public int x = 100;	// Access anywhere in the project
	
	public void m1()	//Access anywhere in the project
	{
		System.out.println("This is m1 method");
	}
	
	
}
