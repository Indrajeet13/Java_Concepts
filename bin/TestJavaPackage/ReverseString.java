package TestJavaPackage;

public class ReverseString {

	public static void main(String[] args) 
	{
		//Approch 1 - using length(), charAt()------------------------------------------
		
		String s="Welcome";
		String rev = "";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev = rev +s.charAt(i);
		}
		System.out.println("Reverse String is : "+rev);

		
		//Approch 2 - without using string method-----------------------------------------
		
		rev = "";
		
		char a[] = s.toCharArray();
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev = rev+a[i];
		}
		System.out.println("Reverse String is : "+rev);
		
		
		//Approch 3 - using StringBuffer Class
		
		StringBuffer sb=new StringBuffer("Welcome");
		System.out.println("Reverse String is : "+sb.reverse());
		
		
		//Approch 4 - using StringBuilder Class
		
		StringBuilder sb1=new StringBuilder("Welcome");
		System.out.println("Reverse String is : "+sb1.reverse());	//Reverse() is only available in the StringBuffer and StringBuilder Class
		
			
		
		
	}

}
