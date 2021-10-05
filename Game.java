
public class Game {
	
	void run() {
		Player player = new Player();
	
		System.out.println(player.name);
		
		Golem golly = new Golem("Golly", "A Tired Old Pile Of Rocks And Boulders", 10, "Golem");
		Goblin gobbles = new Goblin("Gobbles", "A Small Green Creature With A Sly Smile And An Annoying Tendency To Steal All Your Money.", 50, "Goblin");
		
		System.out.println(golly.type);
		
		System.out.println("You meet a " + golly.type + " with " + golly.health + ". Its name is " + golly.name + " and it is " + golly.description);
		System.out.println("You meet a " + gobbles.type + " with " + gobbles.health + ". Its name is " + gobbles.name + " and it is " + gobbles.description);
	
		golly.attack();
		gobbles.attack();
	
	}

}
