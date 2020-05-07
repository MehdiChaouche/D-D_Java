package gameboard;

public class CaseVide extends Case {
	 
	
	public CaseVide() {
		super();
		this.eventName = "Case vide";
		this.name = "Case vide";
	}
	
	public String getName() {
		return eventName;
	}

	@Override
	public void event(Character personnage) {
	}
}
