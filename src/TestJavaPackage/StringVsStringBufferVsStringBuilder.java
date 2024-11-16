package TestJavaPackage;

public class StringVsStringBufferVsStringBuilder {

	public static void main(String[] args) 
	{
	//String - Immutable
		String s="welcome";

		s.concat(" to java");
		System.out.println(s); //welcome //immutable, cannot change original value of s
		
	
	//StringBuffer - mutable
		
		StringBuffer sb1=new StringBuffer("welcome ");
		sb1.append("to java");
		System.out.println(sb1); //welcome to java //mutable, we can change original value of sb1
		
	
	//StringBuilder - mutable
	
		StringBuilder sb2=new StringBuilder("Hi,");
		sb2.append("Hello");
		System.out.println(sb2); //Hi,Hello //mutable, we can change original value of sb2
	}

}
