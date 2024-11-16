package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) 
	{
	
	//Declaration
		
		HashSet myset = new HashSet();
		//Set myset = new HashSet();
		//HashSet <String>

		//Adding elements into Hashset
		myset.add(100);
		myset.add(10.5);
		myset.add("Welcome");
		myset.add(true);
		myset.add(null);
		myset.add(100);
		myset.add(null);
		
		//Printing HashSet
		System.out.println(myset);	//[null, 100, 10.5, Welcome, true]
		
		//Size of Hashset
		System.out.println(myset.size());
		
		
		//Removing element
		myset.remove(10.5);	//10.5 is a value (not an index)
		System.out.println("After removing :"+myset); 	//[null, 100, Welcome, true]
		
		//Inserting elements - Not possible - No indexing
		
		//Access Specific element - Not possible
		
		//Convert HashSet-->ArrayList
		
		ArrayList al = new ArrayList(myset);
		System.out.println(al);	//[null, 100, Welcome, true]
		System.out.println(al.get(2));	//Welcome
		
		//Read all the elements using for...each
		
		for(Object x:myset)
		{
			System.out.println(x);
		}
			
		//Using Iterator
		Iterator <Object> it = myset.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		myset.clear();
		System.out.println();
		
	}

}
