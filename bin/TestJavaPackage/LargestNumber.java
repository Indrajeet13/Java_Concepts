package TestJavaPackage;

public class LargestNumber {

	public static void main(String[] args) 
	{
		int a[] = {10,20,40,30,50};
		int largest = a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i] > largest)
			{
				largest = a[i];
			}
		}
		System.out.println(largest);

	}

}
