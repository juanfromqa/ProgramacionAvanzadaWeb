package genericas;

public class TestPilaGenerica {
public static void main(String args[]) {

	System.out.println("\n++++++++++++++++++++++++++++++++");
	System.out.println("Con clase genérica usando Character: \n");
	
	PilaGenerica<Character> a = new PilaGenerica<Character>();
	
	a.push('a');
	a.push('b');
	a.pop();

	System.out.println(a.peek());
	System.out.println("Fin");
	
	System.out.println("\n++++++++++++++++++++++++++++++++");
	System.out.println("Con clase genérica usando Boolean: \n");
	
	PilaGenerica<Boolean> k = new PilaGenerica<Boolean>();
	k.push(true);
	k.push(false);
	k.push(true);
	k.push(true);
	k.pop();
	k.pop();
	System.out.println(k.peek());
	System.out.println("Fin");
	
	
PilaGenerica<String> s = new PilaGenerica<String>();
	
	s.push("a");
	s.push("b");
	s.pop();

	System.out.println(s.peek());
		
}
}
