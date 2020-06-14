/**
 * 
 */
package fr.diginamic.essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.Piece;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.WC;

/**
 * La classe permettant de faire de tester la création d'une maison
 * 
 * @author Souleymane THIAM
 *
 */
public class TestMaison {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// instanciation d'une variable chambre1
		Chambre maChambre1 = new Chambre(9, 1);

		// instanciation d'une variable chambre2
		Chambre maChambre2 = new Chambre(9, 0);

		// instanciation d'une variable salon
		Salon monSalon = new Salon(12, 1);

		// instanciation d'une variable salon
		WC monWC = new WC(5, 0);

		// instanciation d'une variable salon
		Cuisine maCuisine = new Cuisine(9, 0);

		// création d'un tableau contenant mes 3 pieces créer
		Piece[] pieces = { maChambre1, maChambre2, monSalon, maCuisine };

		// Création de la maison à partir du tableau de pieces
		Maison maMaison = new Maison(pieces);

		// affichage de la superficie du 1er étage de la maison
		System.out.println("Superficie du 1er étage: " + maMaison.superficieEtage(1));

		// affichage de la superficie totale de la maison
		System.out.println("Superficie totale de la maison: " + maMaison.superficieTot());

		// ajout de la piéce monWC à maMaison
		maMaison.ajouterPiece(monWC);

		// affichage de la superficie totale de la maison après ajout d'une nouvelle
		// pièce
		System.out.println("Nouvelle superficie totale de la maison: " + maMaison.superficieTot());

		// affichage de la superficie totale des chambre de la maison maMaison
		System.out.println(
				"Superficie totale de toutes les chambres de la maison: " + maMaison.superficieTotTypePiece("Chambre"));

		// affichage du nombre chambre de la maison
		System.out.println("Nombre de chambres de la maison: " + maMaison.nmbrePieceTyp("Chambre"));

	}

}
