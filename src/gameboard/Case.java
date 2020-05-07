package gameboard;

public abstract class Case {
	public static void main(String[] args) {
	}
	// --- Attributs principaux --- //
	protected String name;
	protected String eventName;
	
	public Case() {
		this.setName(name);
		this.setEventName(name);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setEventName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return eventName;
	}
	
	public abstract void event(Character personnage);
}