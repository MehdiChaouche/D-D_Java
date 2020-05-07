package gameboard;

public class CaseOrc extends Case {
	
	public CaseOrc() {
		super();
		this.name = "Case orc";
	}
	
	public String getEventName() {
		return name;
	}
	
	public void setEventName(String eventName) {
		this.name = eventName;
	}

	@Override
	public void event(Character personnage) {
	}
}
