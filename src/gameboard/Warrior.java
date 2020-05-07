package gameboard;

public class Warrior extends Character {

	public Warrior(String name, int life, int atk) {
		super(name, life, atk);
	}
	
	@Override
	public String toString() {
		return "Warrior " +super.toString();
	}
}