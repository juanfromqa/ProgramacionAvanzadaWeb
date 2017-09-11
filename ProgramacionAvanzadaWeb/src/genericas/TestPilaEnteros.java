package genericas;

import java.util.Scanner;

public class TestPilaEnteros {

	public static void main (String...args) {
		
		PilaEnteros pila = new PilaEnteros();
		
		System.out.println("Cual es el tamaño de la pila?");
		
		Scanner reader = new Scanner(System. in);
		int tamanio = reader.nextInt();
		for (int i = tamanio; i > 0; i--) {
			System.out.println("Ingrese el valor:");
			pila.push(reader.nextInt());
		}
		
		System.out.println("\n Último valor agregado: "+pila.peek());
	}
	
}
