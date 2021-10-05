
public class Monster {
	
	String name;
	String description;
	int health;
	String type;
	
	Monster(String name, String description, int health, String type){
		this.name = name;
		this.description = description;
		this.health = health;
		this.type= type;
		
	}
	
	public void attack() {
		System.out.println("The monster has generically attacked you.");
	}
		

}


