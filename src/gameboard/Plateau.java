package gameboard;
import java.util.*;

public class Plateau {
	// Taille initiale du plateau
	public final int GAMEBOARD_SIZE = 64;
	
	public ArrayList<Case> generate() {
		ArrayList<Case> gameboard = new ArrayList<Case>();
		for (int i = 0; i < GAMEBOARD_SIZE; i++) {
			Random rand = new Random();
			int random = rand.nextInt(3);
			if (random == 0) {
				gameboard.add(new CaseVide());
			}
			else if (random == 1) {
				gameboard.add(generateCaseEnnemie());
			}
			else {
				gameboard.add(generateCaseBonus());
			}
		}
		// System.out.println(gameboard.stream().map(Object::toString).collect(Collectors.joining("\n")));
		viewPlateau(gameboard);
		return gameboard;
	}
	
	// Méthode générant une case bonus ou vide
	private Case generateCaseBonus() {
		int rand = (int)(Math.random()*2);
		if (rand == 0) {
			return new CaseBonus();
		} else {
			return new CaseVide();
		}
	}

	// Méthode générant une case ennemie (orc ou gobelin)
	private Case generateCaseEnnemie() {
		int rand = (int)(Math.random()*2);
		if (rand == 0) {
			return new CaseOrc();
		} else {
			return new CaseGobelin();
		}
	}
	
	// Le print de mon gameboard
	private void viewPlateau(ArrayList<Case> gameboard) {
		for (int i=0; i < gameboard.size(); i++) {
			Case var = gameboard.get(i);
			System.out.println(var.getName());
		}
	}
}