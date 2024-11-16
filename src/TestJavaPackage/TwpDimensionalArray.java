package TestJavaPackage;

public class TwpDimensionalArray 
{

	public static void main(String[] args) 
	{
		
		//Approch 1
		
//		//Declaring array
//		int a[][]=new int[3][2];
//		//int [][]a=new int[3][2];
//		//int []a[]=new int[3][2];
//		
//		//int a[]=new int[5];
//		//int []a=new int[5];
//		
//		a[0][0]=100;
//		a[0][1]=200;
//		
//		a[1][0]=300;
//		a[1][1]=400;
//		
//		a[2][0]=500;
//		a[2][1]=600;
		
		
		//Approch 2
		
		int a[][] = {	{100,200},
						{300,400},
						{500,600}	
					};
		
		//Find size of an array
		System.out.println("Length of rows is "+a.length);
		System.out.println("Length of column is "+a[0].length);
		
		//Read single value from array
		//System.out.println(a[2][1]);
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
		
		//Enhanced for loop
		
		System.out.println("\n");
		for(int arr[]:a)
		{
			for(int x:arr)
			{
				System.out.print(x+"  ");
			}
			System.out.println();
		}
		
		
	}

}
