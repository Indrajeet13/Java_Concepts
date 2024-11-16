package TestJavaPackage;

public class PassingParametersToMainMethod 
{
	
	void main(int a)
	{
		System.out.println(a);
	}

	public static void main(String[] args) 
	{
		System.out.println(args.length);
		
		for(String value:args)
		{
			System.out.println(value);
		}
		
	}

}
