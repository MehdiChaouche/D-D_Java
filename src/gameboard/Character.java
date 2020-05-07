package gameboard;

public abstract class Character {
	
	protected String name;
	protected int life;
	protected int atk;
	
	public Character(String name, int life, int atk) {
		this.setName(name);
		this.setLife(life);
		this.setAtk(atk);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getLife() {
		return life;
	}
	
	public void setLife(int life) {
		this.life = life;
	}
	
	public int getAtk() {
		return atk;
	}
	
	public void setAtk(int atk) {
		this.atk = atk;
	}
	
	@Override
	public String toString() {
		return "name = " + name + "life = " + life + "atk = " + atk;
	}
}
