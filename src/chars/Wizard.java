package chars;

public class Wizard {
	public String Name;
	String Image = "https://cdnb.artstation.com/p/assets/images/images/011/625/205/large/dmitry-bolotov-nerzul1.jpg?1530550868";
	public int Health;
	public int Attack;
	private int min_life = 3;
	private int max_life = 6;
	private int min_attack = 8;
	private int max_attack = 15;
	
	public String toString() {
		return "Personnage : " + this.Name + ".";
	}
	
	public Wizard() {
		this.Name = "Undefined";
		this.Health = 6;
		this.Attack = 8;
	}
	
	public Wizard(String name_arg) {
		this.Name = name_arg;
		this.Health = 6;
		this.Attack = 8;
	}
	
	public Wizard(String name_arg, int life_arg, int attack_arg) {
		if (min_life > life_arg || max_life < life_arg || min_attack > attack_arg || max_attack < attack_arg) {
			throw new IllegalArgumentException("Paramètres invalides");
		}
		this.Name = name_arg;
		this.Health = life_arg;
		this.Attack = attack_arg;
	}
}