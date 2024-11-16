package TestJavaPackage;

public class ContructorOverloading 			// Polymorphisum
{
	
	double width, height, depth;
	

	ContructorOverloading()						//1
	{
		width=height=depth=0;
	
	}
	
	
	ContructorOverloading(double w, double h, double d)			//2
	{
		width=w;
		height=h;
		depth=d;
	}
	
	ContructorOverloading(double len)		//3
	{
		width=height=depth=len;
	}
	
	double volume()
	{
		return(width*height*depth);
	}
	
	
	
	
	public static void main(String[] args) 
	{
		//ContructorOverloading co1 = new ContructorOverloading();
		//ContructorOverloading co4 = new ContructorOverloading( 111.25, 25);
		
		
		ContructorOverloading co3 = new ContructorOverloading(10.5);
		
		System.out.println(co3.volume());
	}

}
