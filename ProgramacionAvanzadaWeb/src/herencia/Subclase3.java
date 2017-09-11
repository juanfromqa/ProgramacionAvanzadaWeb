package herencia;

public class Subclase3 extends Superclase3{
		int a=20;
        public void print() {
                System.out.println(super.a);
 }

        
public static void main(String[] args) {
            Superclase3 lbSuper = new Superclase3();
            Subclase3 lbSub = new Subclase3();
            
           
         // Superclase3.print()
            lbSuper.print(); // #1
            // Subclase3.print()
            lbSub.print();   // #2
            // Subclase3.print()
            ((Superclase3)lbSub).print(); // #3
            // Assign the lbSub to lbSuper
            lbSuper = lbSub; // UPCASTING
            // Subclase3.print()
            lbSuper.print(); // #4

}
}
