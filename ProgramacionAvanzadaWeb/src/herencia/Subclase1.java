package herencia;

public class Subclase1 extends Superclase1 {
	
	public static void main (String...args){
		Subclase1 subClase = new Subclase1();
		subClase.setNombre("Juan Hernandez");
		System.out.println(subClase.getNombre());
	}

}
