package TypeCastingConcepts;

//Upcasting - Converting value from smaller --> larger

//	int --> long
//	float --> double



//Downcasting - Converting value from larger --> smaller

// long --> int
// double --> float




public class TypeCasting 
{
	public static void main(String[] args) 
	{
		
	//upcasting - atomatic -- smaller to larger
		
		int intvalue = 100;
		long longval=intvalue;
		System.out.println(longval);
		
		float floatval=10.5F;
		double doubleval=floatval;
		System.out.println(doubleval);
		
	// downcasting - manually -- larger to smaller
		
		long longval1=1000;
		int intval1=(int) longval1;
		System.out.println(intval1);
		
	// Example 1
		
		int i=10;
		double d=i;	//upcasting
		System.out.println(d);
		
	//Example 2
		
		double d1=10.5;
		int i1 = (int) d1;
		System.out.println(i1);
		
		
	}
}
