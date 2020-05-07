package gameboard;

public class CaseGobelin extends Case {
	
	public CaseGobelin() {
		super();
		this.name = "Case gobelin";
	}
	
	public String getEventName() {
		return name;
	}
	
	public void setName(String Name) {
		this.name = eventName;
	}

	@Override
	public void event(Character personnage) {
		
	}
}