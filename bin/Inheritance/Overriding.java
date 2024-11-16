package Inheritance;

class Bank
{
	double roi()
	{
		return 0;
	}
}

class ICICI extends Bank
{
	double roi()
	{
		return 10.5;
	}
}
class SBI extends Bank
{
	double roi()
	{
		return 11.5;
	}
}

public class Overriding 
{

	public static void main(String[] args) 
	{
		SBI sbi = new SBI();
		System.out.println(sbi.roi());
		
		ICICI icici = new ICICI();
		System.out.println(icici.roi());
		
		

	}

}
