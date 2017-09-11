package herencia;

public class Duck implements Walkable{
	private String name;
    public Duck(String name) {
            this.name = name;
}
    public void walk() {
            System.out.println(name + " duck is walking.");
}

}


