
public class Weapon extends Item{

	String name;
	int damage;
	boolean isWeapon;
	
	Weapon(String name, int damage, boolean isWeapon){
		super(name);
		this.damage = damage;
		this.isWeapon = isWeapon;
	}
}
