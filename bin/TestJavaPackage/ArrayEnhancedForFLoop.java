package TestJavaPackage;

public class ArrayEnhancedForFLoop {

	public static void main(String[] args) 
	{
		int a[] = {100,200,300,400,500};
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		
		//Enhanced for loop
		for(int x:a)
		{
			System.out.println(x);
		}

	}

}
