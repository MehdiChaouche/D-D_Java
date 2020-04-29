package chars;

import misc.*;

public class Warrior {
	public String Name;
	String Image = "https://static1.millenium.org/articles/4/35/48/94/@/1240605-thrall-amp_main_media_schema-1.png";
	public int Health;
	public int Attack;
	Sword sword;
	Shield shield;
	private int min_life = 5;
	private int max_life = 10;
	private int min_attack = 5;
	private int max_attack = 10;
	
	public String toString() {
		return "Personnage : " + this.Name + ".";
	}

	public Warrior() {
		this.Name = "Undefined";
		this.Health = 10;
		this.Attack = 5;
	}
	
	public Warrior(String name_arg) {
		this.Name = name_arg;
		this.Health = 10;
		this.Attack = 5;
		this.sword = new Sword();
		this.shield = new Shield();
	}
	
	public Warrior(String name_arg, int life_arg, int attack_arg) {
		if (name_arg.equals("") || min_life > life_arg || max_life < life_arg || min_attack > attack_arg || max_attack < attack_arg) {
			throw new IllegalArgumentException("Paramètres invalides");
		}
		this.Name = name_arg;
		this.Health = life_arg;
		this.Attack = attack_arg;
	}
}