package TestPackage;

class Account
{
	private long accno;  
	private String name,email;  
	private float amount;  
	
	long getAcc_no(long accno) 
	{  
		this.accno=accno;
	    return accno;  
	}  
	String getName(String name)
	{
		this.name=name;
		return name;
	}
	String setEmail(String email) 
	{  
	    this.email = email;  
	    return email;
	}  
	
	
}
public class EncapsClass {

	public static void main(String[] args) 
	{
		Account ac = new Account();

	}

}
