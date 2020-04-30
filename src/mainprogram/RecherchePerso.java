package mainprogram;

import java.util.ArrayList;
import java.util.Scanner;

import chars.Warrior;
import chars.Wizard;

abstract class RecherchePerso {
	private static final int GUERRIER = 2;
	private static final int SORCIER = 1;
	private static final int RIEN = 0;

	public static void recherche(ArrayList<Warrior> warriors, ArrayList<Wizard> wizards, Scanner scanner) {
		int[] resultat_tableau = new int[2];
		System.out.println("Le nom du personnage à modifier ?");
		System.out.println("|||");
		System.out.println("Taper Q vous renverra au menu principal.");
		
		String cmd = scanner.nextLine();
		if (cmd.equals("Q")) {
			System.out.println("Redirection vers le menu principal.");
			return;
		}
		
		resultat_tableau = RecherchePerso.recherchePerso(wizards, warriors, cmd);
		
		if (resultat_tableau[0] == GUERRIER) {
			System.out.println(warriors.get(resultat_tableau[1]).toString());
		} else if (resultat_tableau[0] == SORCIER) {
			System.out.println(wizards.get(resultat_tableau[1]).toString());
		}
	}

	private static int[] recherchePerso(ArrayList<Wizard> wizards, ArrayList<Warrior> warriors, String cmd) {
		// Réinitialise le tableau de résultats.
		int[] resultat_tableau = new int[2];
		
		// Mes boucles comparent mes inpust et mes valeurs.
		for (int i = 0; i < warriors.size(); i++) {
			if (warriors.get(i).Name.equals(cmd)) {
				resultat_tableau[0] = GUERRIER;
				resultat_tableau[1] = i;
				return resultat_tableau;
			}
		}
		// Mes boucles comparent mes inpust et mes valeurs.
		for (int i = 0; i < wizards.size(); i++) {
			if (wizards.get(i).Name.equals(cmd)) {
				resultat_tableau[0] = SORCIER;
				resultat_tableau[1] = i;
				return resultat_tableau;
			}
		}
		
		// Si les deux boucles ne renvoient rien, alors les deux index restent à 0.
		resultat_tableau[0] = RIEN;
		resultat_tableau[1] = RIEN;
		return resultat_tableau;
	}
}
