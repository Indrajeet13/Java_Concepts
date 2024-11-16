package ExceptionHandling;

public class MultipleCatchBlocks {

	public static void main(String[] args) 
	{
		System.out.println("Program is started..");
		
		String s=null;
		
		try
		{
			System.out.println(s.length());
		}
		/*
		catch(ArithmeticException e)
		{
			System.out.println("\nHandled Exception");
			System.out.println(e.getMessage());
		}
		catch(NumberFormatException e)
		{
			System.out.println("\nHandled Exception");
			System.out.println(e.getMessage());
		}
		catch(NullPointerException e)
		{
			System.out.println("\nHandled Exception");
			System.out.println(e.getMessage());
		}
		*/
		catch(Exception e)	//Handle all type of exceptions
		{
			System.out.println("\nHandled Exception");
			System.out.println(e.getMessage());
		}
		
		System.out.println("\nProgram is Finished..");

	}

}
