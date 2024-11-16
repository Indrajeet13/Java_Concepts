package WrapperClass;

public class DataConversionMethods 
{
	public static void main(String[] args) 
	{
		
	//String --> int
		
		//String s = "Welcome";	//Cannot convert to int
		//int sint = Integer.parseInt(s);
		
//		String s1 = "10";
//		String s2 = "20";
//		
//		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
		
	//String --> double	
		
//		String s1 = "10.5";
//		String s2 = "22.00";
//		System.out.println(Double.parseDouble(s1)+Double.parseDouble(s2));
		
		
	//String --> bool
		
//		String s = "true";
//		System.out.println(Boolean.parseBoolean(s));
//		
//		String s1 = "Welcome";
//		System.out.println(Boolean.parseBoolean(s1));
		
		//String to char is not possible
		
	
	//int, double, bool, char -----> String
		
		int a=10;
		double d = 10.5;
		char c = 'A';
		boolean bool = true;
		
		System.out.println(String.valueOf(a));
		System.out.println(String.valueOf(d));
		System.out.println(String.valueOf(c));
		System.out.println(String.valueOf(bool));
		
		
	}
}
