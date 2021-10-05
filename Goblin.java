
public class Goblin extends Monster{

	Goblin(String name, String description, int health, String type){
		super(name, description, health, type);
	}
	
	public void attack() {
		System.out.println("Thes Goblin has attacked by stealing all of your gold, this makes you depressed, this hurts you.");
	}

}
