package TestJavaPackage;

public class GreetingsMain {

	public static void main(String[] args) 
	{
		Greetings gr = new Greetings();
		gr.m1();

		String str = gr.m2();
		System.out.println(str);
		
		gr.m3("Ajay", 5);
		
		String str1 = gr.m4("Indra");
		System.out.println(str1);

	}

}
