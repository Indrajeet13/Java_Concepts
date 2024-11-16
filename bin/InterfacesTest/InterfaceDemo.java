package InterfacesTest;

interface Shape
{
	int length = 10;	//final & static
	int width = 20;		//final & static
	
	void circle();	//abstract method
	
	default void square()
	{
		System.out.println("This is Square - Default method");
	}
	
	static void rectangle()
	{
		System.out.println("This is rectancgle - static method");
	}
	
}
	



public class InterfaceDemo implements Shape
{
	public void circle()	//abstract method 
	{
		System.out.println("This is circle - abstract method");
	}
	
	void triangle()
	{
		System.out.println("This is triangle method....");
	}
	
	int x=100,y=200;
	
	
	public static void main(String[] args) 
	{
		
		//Scenario 1
		
		
		  InterfaceDemo idobj = new InterfaceDemo(); 
		  
		  idobj.circle(); 	//abstract
		  idobj.square();	//default
		  
		  Shape.rectangle(); //static method can directly access from interface
		  idobj.triangle();
		
		
		//Scenario 2
		
		Shape sh = new InterfaceDemo();
		
		sh.circle();	//abstract
		sh.square();	//default
		
		Shape.rectangle();	//static method can directly access from interface

		//sh.triangle();	//we cannot access using Shape  interface
		
		System.out.println(Shape.length*Shape.width);	//accessing static variables directly
		
		//System.out.println(sh.x+sh.y); //Cannot access
		

	}

}
