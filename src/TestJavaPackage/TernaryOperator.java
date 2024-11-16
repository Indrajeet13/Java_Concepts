package TestJavaPackage;

public class TernaryOperator {

	public static void main(String[] args) 
	{
		int a=20, b=30;
		
		/*
		 * if(a>b) { System.out.println("A is greater"); } 
		 * else {
		 * System.out.println("B is greater"); }
		 */
		
		int max = (a > b)? a : b;
		
		System.out.println("Maximum number is :" +max);
		
	}

}
