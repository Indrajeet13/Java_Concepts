package TypeCastingConcepts;

//A b=(C) d; 

public class TypeCastingObject3 {

	public static void main(String[] args) 
	{
		
	//Ex1
		//Object o = new String("Welcome");
		//StringBuffer sb = (StringBuffer) o;	//Rule 1-YES,	Rule 2-YES, Rule 3-Failed
		
	//Ex2
		//String s = new String("Welcome");
		//StringBuffer sb = (StringBuffer) s;	//Rule 1- Failed
		
	//Ex3
		//Object o = new String("Welcome");
		//StringBuffer sb = (StringBuffer) o;	//Rule 1-YES,	Rule 2-YES, Rule 3-Failed
		
	//Ex4
		//Object o = new String("Welcome");
		//StringBuffer sb = (StringBuffer) o;	//Rule 1-YES,	Rule 2-Failed
		
	//Ex5
		//String s = new String("Welcome");
		//StringBuffer sb = (String) s;			//Rule 1-YES,	Rule 2-Failed
		
	//Ex6
		//Object o = new String("Welcome");
		//StringBuffer sb = (StringBuffer) o;	//Rule 1-YES,	Rule 2-YES, Rule 3-Failed
	
	//Ex7 
		Object o = new String("Welcome");
		String s = (String) o;		//Rule 1-YES,	Rule 2-YES, Rule 3-YES
		
		System.out.println(s);
		
		
	}

}
