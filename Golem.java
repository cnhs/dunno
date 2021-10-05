
public class Golem extends Monster{
	
	Golem(String name, String description, int health, String type){
		super(name, description, health, type);
	}
	
	public void attack() {
		System.out.println("The Golem has hit you with a rock.");
	}
	
	
}
