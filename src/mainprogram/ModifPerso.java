package mainprogram;

import java.util.ArrayList;
import java.util.Scanner;

import chars.Warrior;
import chars.Wizard;

public abstract class ModifPerso {
	public static void modifPerso (ArrayList<Warrior> warriors, ArrayList<Wizard> wizards, Scanner scanner){
		int resultat_index;
		int[] resultat_tableau = new int[2];
		while (true) {
			System.out.println("Modifier quel personnage ?");
			System.out.println("|||");
			System.out.println("Tapez Q pour revenir au menu principal.");
			
			String cmd = scanner.nextLine();
			if (cmd.equals("Q")) {
				System.out.println("Redirection vers le menu principal.");
				break;
			}
			
			resultat_index = RecherchePerso.recherchePerso(wizards, warriors, cmd);
		}
	}
}
