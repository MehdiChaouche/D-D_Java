package gameboard;

import java.util.*;

public class Launcher {
	Plateau gameboard = new Plateau();
	ArrayList<Case> playboard = gameboard.generate();
	int characterLocation = 0;
	
	public void start(Character personnage) {
		for (int i=0; i<playboard.size(); i++) {
			launch(personnage, playboard.get(i));
		}
	}
	
	public void launch(Character personnage, Case var) {
		System.out.println("Life before : " + personnage.getLife());
		System.out.println(var.getName());
		var.event(personnage);
		System.out.println("Life after : " + personnage.getLife());
	}
}
