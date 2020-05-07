package gameboard;

public class Wizard extends Character {

	public Wizard(String name, int life, int atk) {
		super(name, life, atk);
	}
	
	@Override
	public String toString() {
		return "Wizard " +super.toString();
	}
}