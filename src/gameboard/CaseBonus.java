package gameboard;

public class CaseBonus extends Case {
	
	
	public CaseBonus() {
		super();
		this.name = "Case bonus";
	}
	
	public String getName() {
		return name;
	}

	@Override
	public void event(Character personnage) {
	}
}
