package assistant.perso;

import java.util.Scanner;

public class Menu {

	public String selectMainMenu(int rep) {
		return null;
	}
	
	public int getMainMenu() {
		Scanner sc = new Scanner(System.in);
		String mainMenu = "";
		mainMenu += "Que voulez vous faire ?\n";
		mainMenu += "1- Afficher le mois suivant.\n";
		mainMenu += "2- Afficher le mois pr�c�dent.\n";
		mainMenu += "3- Cr�er un �venement.\n";
		mainMenu += "4- Modifier un �venement.\n";
		mainMenu += "5- Supprimer un �venement.";
		System.out.println(mainMenu);
		int choix = 0;
		while(choix < 1 || choix > 5) {
			System.out.print("Votre choix : ");
			choix = sc.nextInt();
		}
		return choix;
	}
}
