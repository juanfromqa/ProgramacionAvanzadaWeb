package herencia;

import java.util.Scanner;

public class RomboHueco {

	public static void main(String...strings ) {
	Scanner reader = new Scanner(System.in);  
    System.out.println("Ingresa el número de datos: ");
    int n = reader.nextInt(); 

    for (int i = 0; i < n; ++i) {
        System.out.println();
        for (int j = 0; j < n-i-1; ++j) {                      
            System.out.print(" ");           
        }
        for (int j = 0; j < 2*i+1; ++j){
            if ((i==0)||(j==0)||(j==2*i)) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }                
        }            
    }
    for (int j = n-2; j >= 0; --j) {
        System.out.println();
        for (int i = 0; i < n-j-1; ++i) {                
            System.out.print(" ");
        }
        for (int i = 0; i < 2*j+1; ++i) {
            if ((j==0)||(i==0)||(i==2*j)) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }                
        }
    }
    System.out.println();
 }

}
