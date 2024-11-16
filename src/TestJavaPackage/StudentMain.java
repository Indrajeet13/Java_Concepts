package TestJavaPackage;

public class StudentMain {

	public static void main(String[] args) 
	{
		
		//Student st = new Student();
		
		
		//1) Using Object reference variable
		/*
		st.sid=101;
		st.sname="John";
		st.grad='A';
		*/
		
		
		//2) Using Method
		
//		st.setStudentData(101, "John", 'A');
//		st.printStudentData();
		
		
		//3) Using Constructor
		
		Student st = new Student(101, "John", 'A');
		st.printStudentData();
		
	}

}
