package ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) 
	{

		System.out.println("Program is started..................");
		
		String s="Welcome";
		
		try
		{
			System.out.println(s.length());
		}
		catch(NumberFormatException e)	
		{
			System.out.println("\nCatch Block handled Exception");
			System.out.println(e.getMessage());
		}
		finally		//Always execute while exception is occurred or not
		{
			System.out.println("\nYou entered into finally block");
		}
		
		
		
		System.out.println("\nProgram is Finished..............");

	}

}
