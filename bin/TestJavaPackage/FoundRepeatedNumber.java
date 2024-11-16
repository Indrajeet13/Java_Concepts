package TestJavaPackage;

public class FoundRepeatedNumber {

	public static void main(String[] args) 
	{
		int a[] = {10,20,40,30,50,30,50,50};
		int count=0,num=50;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==num)
			{
				count++;
			}
		}
		System.out.println("The number "+num+" repeated times : "+count);
		
	}

}
