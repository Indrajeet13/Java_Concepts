package TypeCastingConcepts;

class Parent 
{
	String name = "John";
	
	void m1()
	{
		System.out.println("This is m1 from Parent class...");
	}	
}

class Child extends Parent 
{
	int id = 101;
	
	void m2()
	{
		System.out.println("This is m2 from Child class...");
	}	
}


public class TypeCastingObjects1 {

	public static void main(String[] args) 
	{
//		Child c = new Child();
//		System.out.println(c.name);		//Parent
//		c.m1();
//		
//		System.out.println(c.id);		//Child
//		c.m2();
		
//		Parent p = new Child();		//Upcasting
//		System.out.println(p.name);
//		p.m1();
		
//		System.out.println(p.id);	//We cannot access	
//		p.m2();		//WE cannot access
		
//		Parent p = new Parent();	//Downcasting	// will throw error
//		Child c = (Child) p;
//		
//		System.out.println(c.name);		
//		c.m1();
//		System.out.println(c.id);		
//		c.m2();
		
		
		
		
		
	}

}
