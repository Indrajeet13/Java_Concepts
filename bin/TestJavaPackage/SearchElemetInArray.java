package TestJavaPackage;

public class SearchElemetInArray 
{
	public static void main(String[] args) 
	{
		
		int a[] = {10,20,40,30,50,30};
		int searchElement = 30;
		boolean status = false;
				
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==searchElement)
			{
				System.out.println("Element Found :"+searchElement);
				status = true;
				break;
			}
		}
		if(status==false)
			System.out.println("Element Not Found");
		
		
		
		//Enhanced for loop---------------------------------------------------
		
		for(int x:a)
		{
			if(x==searchElement)
			{
				System.out.println("Element Found :"+searchElement);
				status = true;
				break;
			}
		}
		if(status==false)
			System.out.println("Element Not Found");
		
	}

}
