package herencia;

public class Subclase2 extends Superclase2{
    // An instance variable
    public String str = "EarlyBindingSub";
    // A static variable
    public static int count = 200;
    public static void print() {
            System.out.println("Dentro de Subclase2.print()");
} 
public static void main(String...args)   {
	
	Subclase2 a = new Subclase2();
	a.print();
	
	}
}

