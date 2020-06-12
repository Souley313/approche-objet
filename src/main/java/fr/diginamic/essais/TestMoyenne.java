/**
 * 
 */
package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

/**
 * @author Souleymane THIAM
 *
 */
public class TestMoyenne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] tab = { 12.0, 10.5 };

		System.out.println("Le tableau initial:");
		for (int i = 0; i < tab.length; i++) {
			System.out.println(tab[i]);
		}

		// Calcul de la moyenne du nouvau tableau
		double moy1 = CalculMoyenne.calcul(tab);
		System.out.println("La moyenne du nouveau tableau est: " + moy1);

		// Ajout d'un élèment dans notre tableau
		System.out.println("\nLe tableau après ajout d'un élèment");
		double[] nvTab = CalculMoyenne.ajout(tab, 5.0);
		for (int i = 0; i < nvTab.length; i++) {
			System.out.println(nvTab[i]);
		}

		// Calcul de la moyenne du nouvau tableau
		double moy = CalculMoyenne.calcul(nvTab);
		System.out.println("La moyenne du nouveau tableau est: " + moy);

	}

}
