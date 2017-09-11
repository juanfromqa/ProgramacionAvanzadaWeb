package herencia;

public class WalkableTest {
	public static void main(String[] args) {
		
//	    Person[] persons = new Person[3];
//	    persons[0] = new Person("Jack");
//	    persons[1] = new Person("Jeff");
//	    persons[2] = new Person("John");
//	    //Let everyone walk
//	    Walkable.letThemWalk(persons);
//	    
//	    Duck[] ducks = new Duck[3];
//	    ducks[0] = new Duck("duck 1");
//	    ducks[1] = new Duck("duck 2");
//	    ducks[2] = new Duck("duck 3");
//	    //Let everyone walk
//	    Walkable.letDucksWalk(ducks);
		
		Walkable w1 = new Person("Jack"); // Ambas Implementan Walkable
		Walkable w2 = new Duck("Duck");   // crear referencias
		
		// Let the person walk
		w1.walk();
		// Let the duck walk
		w2.walk();
		
		int enume = w1.YES;
		
		
		

	}
		
		
}
