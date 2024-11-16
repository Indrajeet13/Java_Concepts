package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo 
{
	public static void main(String[] args) 
	{
		//Declaration
		
		ArrayList mylist = new ArrayList();
		//List mylist = ArrayList();
		
		//ArrayList <String>mylist = new ArrayList<String>();
		
		//Addding data into arraylist
		
		
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("Welcome");
		mylist.add('A');
		mylist.add(true);
		mylist.add(null);
		mylist.add(100);	//duplicate
		mylist.add(null);	//duplicate
		
		//Size of arraylist
		System.out.println("Size of an arraylist :"+mylist.size());
		
		//Print arraylist
		System.out.println("Printing data from arraylist :"+mylist); 	//[100, 10.5, Welcome, A, true, null, 100, null]
		
		//Remove element from arraylist
		mylist.remove(5);
		System.out.println("After removing the arraylist :"+mylist);	//[100, 10.5, Welcome, A, true, 100, null]
		
		//add element to arraylist
		mylist.add(5,"Java");
		System.out.println("After Insertion :"+mylist);		//[100, 10.5, Welcome, A, true, Java, 100, null]
		
		//Modify element in the arraylist
		mylist.set(2, "Python");
		System.out.println("After replacing :"+mylist);
		
		//Access specific element from arraylist
		System.out.println(mylist.get(4));
		
	//Reading all the elements from arraylist
		
		//Using normal for loop
		
//		for(int i=0; i<mylist.size();i++)
//		{
//			System.out.println(mylist.get(i));
//		}
		
		
		//Using for..each loop
		
//		for(Object x:mylist)
//		{
//			System.out.println(x);
//		}
		
		
		//Using iterator
		
		Iterator it = mylist.iterator();
		
		System.out.println(it.next());
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//Checking arraylist is empty or not
		System.out.println("Is arraylist empty?"+mylist.isEmpty());
		
		//Remove all the element from arraylist
		ArrayList mylist2 = new ArrayList();
		
		mylist2.add('A');
		mylist2.add(true);

		mylist.removeAll(mylist2);
		System.out.println("After removing the multiple elements :"+mylist);
		
	}

	
}
