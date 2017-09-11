package genericas;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Juan Hernández Sánchez
 *
 */

public class PilaGenerica<T> {
	
	public static final String PILA_VACIA = "Pila sin datos";
	public static final String PILA_CON_DATOS = "Pila con datos";
	
	ArrayList<T> pila = new ArrayList<T>();
	
	//Agrega dato entero a la pila
	public void push(T elementoAgregado) {
		this.pila.add(elementoAgregado);
	}
	
	//Elimina el último dato ingresado
	public void pop() {
		if (this.empty()==PILA_CON_DATOS)
			this.pila.remove(pila.size()-1);
		else 
			System.out.println("\nNo se puede eliminar elemento, pila vacía");
	}	
	
	//Muestra último valor de la pila
	public T peek() {
		if(!(pila.size()==0))
			return pila.get(pila.size()-1);
		return null;
	}
	
	//Verifica si la pila está vacía
	public String empty() {
		if(pila.size()==0)
			return PILA_VACIA;
		else
			return PILA_CON_DATOS;
	}
	

}
