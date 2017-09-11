package herencia;

//public class Walkable {
public interface Walkable{	
	//Solución con muchas líneas de código
//    public static void letThemWalk(Person[] list){
//            for(Person person : list) {
//                    person.walk();
//            }
//    }
//    public static void letDucksWalk(Duck[] list){
//        for(Duck duck : list) {
//                duck.walk();
//        }
//}
	
	
	public static final int YES = 1;
    public static final int NO = 2;
	//A partir de java 8 permite agregar métodos estaticos
    public static void imprime() {
    		
    }
    
	void walk();
	
	
	
	
    
}



