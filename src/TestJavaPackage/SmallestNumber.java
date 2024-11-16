package TestJavaPackage;

public class SmallestNumber {

	public static void main(String[] args) {
		
		int a[] = {10,20,40,30,50};
		int smallest = a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i] < smallest)
			{
				smallest = a[i];
			}
		}
		System.out.println(smallest);

	}

}
