package TypeCastingConcepts;

class Animal{}

class Dog extends Animal{}
class Cat extends Animal{}

// Cat ct = (Cat) an;
//  A   B     C    D


public class TypeCastingObject2 {

	public static void main(String[] args) 
	{
	
	//Rule 1 : conversion is valid or not
	// The type of 'd' and 'c' must have some relationship (either parent to child or child to parent)
		
//		Animal  an = new Dog();
//		Cat ct1 = (Cat) an;	//valid as per rule 1
//		
//		Dog dg1 = new Dog();
//		Cat ct2 = (Cat) dg;	//invalid as per rule 1
		
	
	//Rule 2 : assignment is valid or not
	//'C' must be either same or child of 'A'
		
//		Animal an = new Dog();
//		Cat ct = (Cat) an;	//valid as per rule 2 
		
//		Animal an = new Dog();
//		Cat ct = (Dog) an;	//invalid as per rule 2
		
	
	//Rule 3:
	//The underlying object type of 'd' must be either same or child of 'C'
		
//		Animal an = new Dog();
//		Cat ct = (Cat) an;	//invalid as per rule 3
		
	
	//Rule 1, Rule 2, Rule 3
		Animal an = new Dog();
		Dog dg = (Dog) an;	//Rule 1-YES,	Rule 2-YES, Rule 3-YES
		
	// In the typecasting all rules should be passed	
	
		
	}

}
