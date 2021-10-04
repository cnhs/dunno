import java.util.Scanner;
import java.util.Random;

public class Player {
	
	Scanner scanner = new Scanner(System.in);
	Random rand = new Random();
	
	// Attributes
	String name;

	
	
	Player(){
		System.out.print("What be thy name? ");
		this.name = scanner.next();
		 
	}

}
