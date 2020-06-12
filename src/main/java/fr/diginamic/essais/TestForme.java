/**
 * 
 */
package fr.diginamic.essais;

import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Forme;
import fr.diginamic.formes.Rectangle;

/**
 * @author Souleymane THIAM
 *
 */
public class TestForme {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Création d'une variable de type rectangle
		Forme rectangle = new Rectangle(3, 1.5);
		System.out.println("les dimensions de mon rectangle:");
		AffichageForme.afficher(rectangle);

		// Création d'une variable de type carré
		Forme carre = new Carre(2);
		System.out.println("\nles dimensions de mon carré:");
		AffichageForme.afficher(carre);

		// Création d'une variable de type cercle
		Forme cercle = new Cercle(1.5);
		System.out.println("\nles dimensions de mon cercle:");
		AffichageForme.afficher(cercle);

	}

}
