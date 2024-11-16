package TestJavaPackage;

public class MethodOverloading {

	int a=10, b=20;
	
	void sum()						//1
	{
		System.out.println(a+b);
	}
	
	
	void sum(int x, int y)			//2
	{
		System.out.println(x+y);
	}
	
	
	void sum(int x, double y)		//3
	{
		System.out.println(x+y);
	}
	
	
	void sum(double x, int y)		//4
	{
		System.out.println(x+y);
	}
	
	
	
	public static void main(String[] args) 
	{
		MethodOverloading mo = new MethodOverloading();
		mo.sum();
		mo.sum(22, 30);
		mo.sum(15, 11.55);
		mo.sum(15.5, 20);
		
		
	}

}
