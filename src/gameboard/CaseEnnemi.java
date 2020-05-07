package gameboard;

public abstract class CaseEnnemi extends Case {
	
	
	public CaseEnnemi() {
		super();
		this.eventName = "Case ennemi";
		this.name = "Case ennemi";
	}
	
	public String getName() {
		return name;
	}
}
