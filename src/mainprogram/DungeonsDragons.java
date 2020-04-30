package mainprogram;

import java.util.Scanner;
import java.util.ArrayList;
import chars.*;

public class DungeonsDragons {
	public static void main(String [] args) {
		ArrayList<Warrior> warriors = new ArrayList<Warrior>();
		ArrayList<Wizard> wizards = new ArrayList<Wizard>();
		/* -- Initialisation des compteurs & variables -- */
		int warriors_number = 0;
		int wizards_number = 0;
		int life_selection;
		int attack_power_selection;
		while (true) {
			// Scanner r�cup�re les entr�es clavier. //
			Scanner scanner = new Scanner(System.in);
			System.out.println("D�but du programme.");
			System.out.println("Souhaitez-vous cr�er un guerrier ou un sorcier ?");
			System.out.println("Veuillez taper G pour Guerrier ou S pour Sorcier. Q pour quitter.");
			System.out.println("Vous pouvez �galement (M)odifier des personnages existants ci-dessus.");
			String cmd = scanner.nextLine();
			// Fin du programme par l'user. //
			if (cmd.equals("Q")) {
				scanner.close();
				System.out.println("Fin du programme. Merci pour votre participation.");
				break;
			}
			// Modification d'un personnage. //
			if (cmd.equals("M")) {
				// TODO
				ModifPerso.modifPerso(warriors, wizards, scanner);
			}
			// S�lection incorrecte. //
			if (!cmd.equals("G") && !cmd.equals("S")) {
				System.out.println("Erreur dans votre requ�te.");
				break;
			}
			// Choix du nom et des propri�t�s basiques du personnage. //
			System.out.println("Choisissez un nom, aventurier : ");
			String name_selection = scanner.nextLine();
			System.out.println("Entrez le maximum de points de vie (Warrior: 5-10, Wizard: 3-6) : ");
			try {
				life_selection = scanner.nextInt();
			} catch (Exception inputMismatchException) {
				// Si les points de vie ne correspondent pas au format demand�. //
				System.out.println("Mauvais format d'entr�e.");
				life_selection = 0;
			}
			System.out.println("Entrez les points d'attaque (Warrior: 5-10, Wizard: 8-15) : ");
			try {
				attack_power_selection = scanner.nextInt();
			} catch (Exception inputMismatchException) {
				// Si les points d'attaque ne correspondent pas au format demand�. //
				System.out.println("Mauvais format d'entr�e.");
				attack_power_selection = 0;
			}
			// Si le choix du nom est bien une cha�ne de caract�res. //
			if (name_selection.equals("")) {
				if (cmd.equals("G") || cmd.equals("S") || (!name_selection.equals("") && (life_selection == 0 || attack_power_selection == 0))) {
					CreationPerso.creationPerso;
				}
				// "G" pour Guerrier. //
				if (cmd.equals("G")) {
					Warrior warrior = new Warrior();
					System.out.println("Cr�ation du personnage guerrier " + warrior.Name);
					warriors.add(warriors_number, warrior);
					// Incr�mentation du compteur de guerriers.
					++warriors_number;
				// "S" pour Sorcier.
				} else if (cmd.equals("S")) {
					Wizard wizard = new Wizard();
					System.out.println("Cr�ation du personnage sorcier" + wizard.Name);
					wizards.add(wizards_number, wizard);
					// Incr�mentation du compteur de sorciers.
					++wizards_number;
				}
			} else if (!name_selection.equals("") && (life_selection == 0 || attack_power_selection == 0)) {
				if (cmd.equals("G")) {
					Warrior warrior = new chars.Warrior(name_selection);
					System.out.println("Cr�ation du personnage guerrier" + warrior.Name);
					warriors.add(warriors_number, warrior);
					++warriors_number;
				} else if (cmd.equals("S")) {
					Wizard wizard = new Wizard(name_selection);
					System.out.println("Cr�ation du personnage sorcier" + wizard.Name);
					wizards.add(wizards_number, wizard);
					++wizards_number;
				}
			} else if (!name_selection.equals("") && (life_selection != 0 && attack_power_selection != 0)) {
				try {
					if (cmd.equals("G")) {
						Warrior warrior = new Warrior(name_selection, life_selection, attack_power_selection);
						System.out.println("Cr�ation du personnage " + warrior.Name + " Life = " + warrior.Health + " Attack power : " + warrior.Attack);
						warriors.add(warriors_number, warrior);
						++warriors_number;
					} else if (cmd.equals("S")) {
						Wizard wizard = new Wizard(name_selection, life_selection, attack_power_selection);
						System.out.println("Cr�ation du personnage " + wizard.Name + " Life : " + wizard.Health + " Attack power : " + wizard.Attack);
						wizards.add(wizards_number, wizard);
						++wizards_number;
					}
				} catch (Exception IllegalArgumentException) {
					System.out.println("Param�tre de vie ou d'attaque invalide.");
					if (cmd.equals("G")) {
						Warrior warrior = new Warrior(name_selection);
						System.out.println("Cr�ation du personnage " + warrior.Name);
						warriors.add(warriors_number, warrior);
						++warriors_number;
					} else if (cmd.equals("S")) {
						Wizard wizard = new Wizard(name_selection);
						System.out.println("Cr�ation du personnage sorcier " + wizard.Name);
						wizards.add(wizards_number, wizard);
						++wizards_number;
					}
				}
			}
			
			/* -- Affichage des informations des personnages -- */
			System.out.println(warriors.toString());
			System.out.println(wizards.toString());
		}
	}
}




//while (true) {
//	boolean life_selected = false;
//	boolean attack_selected = false;
//	Scanner scanner = new Scanner(System.in);
//	System.out.println("Souhaitez-vous cr�er un guerrier ou un sorcier ?");
//	String char_select = scanner.nextLine();
//	System.out.println(char_select);
//	if (!char_select.contentEquals("W") && char_select.equals("D")) {
//		System.out.println("Erreur");
//		continue;
//	}
//	System.out.println("Choisissez un nom :");
//	String name_select = scanner.nextLine();
//	System.out.println("Entrez les points de vie de votre personnage :");
//	int life_select = scanner.nextInt();
//	System.out.println("Entrez les points d'attaque de votre personnage :");
//	int attack_select = scanner.nextInt();
//	if (char_select == "W") {
//		if (name_select == "") {
//			Warrior warrior = new Warrior();
//			System.out.println(warrior.name + " a �t� cr�� !");
//		} else if (name_select != "" && (!life_select || !attack_select)) {
//			Warrior warrior = new Warrior(name_select);
//			System.out.println(warrior.name + " a �t� cr�� !");
//		} else if (name_select != "" && (life_select && attack_select))
//	}
//}