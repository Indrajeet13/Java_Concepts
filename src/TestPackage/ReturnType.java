package TestPackage;

public class ReturnType 
{
	private String str;
	int add(int a, int b, int c)
    {
         
        int sum = a + b + c;
        return sum;
    }
	double add(double a, double b)
    {
 
        double sum = a + b + 0.00;
        return sum;
    }
	String add(String str)
    {
 
       this.str=str;
        return str;
    }
	public static void main(String[] args) 
	{
		ReturnType rt = new ReturnType();
		double sum1 = rt.add(3.50, 100.70);
		System.out.println("Sum opf three double values is :" +sum1);
	
		int sum2 = rt.add(10, 30, 55);
		System.out.println("Sum opf three integer is :" +sum2);
		
		System.out.println(rt.add("India"));
		
	}
	
	
}
