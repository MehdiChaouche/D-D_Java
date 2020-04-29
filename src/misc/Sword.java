package misc;

public class Sword {
	private String Name;
	private int dmg;
	
	public Sword() {
		Name = "Anduril";
		dmg = 5;
	}
	
	public Sword(String name_arg, int damage_arg) {
		Name = name_arg;
		dmg = damage_arg;
	}
	
	void setName(String new_name) {
		this.Name = new_name;
	}
	
	String getName() {
		return this.Name;
	}
	
	void setDmg(int new_damage) {
		this.dmg = new_damage;
	}
	
	int getDmg() {
		return this.dmg;
	}
}