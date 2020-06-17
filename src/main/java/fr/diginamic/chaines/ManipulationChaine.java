/**
 * 
 */
package fr.diginamic.chaines;

import fr.diginamic.entites.Personne;
import fr.diginamic.banque.entites.Compte;

/**
 * @author Souleymane THIAM
 *
 */
public class ManipulationChaine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String chaine = "Durand;Marcel;012543;1 523.5";

		// afficher le premier caractère de la chaine de caractères
		char premierCaractere = chaine.charAt(0);
		System.out.println("Premier caractère: " + premierCaractere);

		// afficher la taille de la chaine de caractères
		int tailleChaine = chaine.length();
		System.out.println("Taille de la chaine de caractères: " + tailleChaine);

		// afficher l’index du premier « ; » contenu dans la chaine de caractères
		int indexCaractere = chaine.indexOf(';');
		System.out.println("Indexe du premier « ; » contenu dans la chaine de caractères: " + indexCaractere);

		// extraire une portion de chaine de caractères comprise entre un index de début
		// et un index de fin (exclu).
		String ch = chaine.substring(0, 6);
		System.out.println("Nom de famille: " + ch);

		// afficher les lettre en majuscules
		System.out.println("Nom de famille en majuscules: " + ch.toUpperCase());

		// afficher les lettre en minuscules
		System.out.println("Nom de famille en minuscules: " + ch.toLowerCase());
		
		//utilisation de la methode split pour découper une chaine de caractères
		String[] decoupch = chaine.split(";");
		for(int i=0; i<decoupch.length; i++) {
			System.out.println(decoupch[i]);
		}
		
		//Creation d'une instance Client à partir des éléments issus du découpage de la chaine de caractères
		Personne client = new Personne(decoupch[0], decoupch[1]);
		System.out.println("Nom du client: "+client.getNom()+ "\nPrénom du client: "+client.getPrenom());
		
		//Creation d'une instance de Compte à partir des éléments issus du découpage de la chaine de caractères
		int num = Integer.parseInt(decoupch[2]);//transformer chaine en int
		String sld = decoupch[3].replace(" ", "");//supprimer les espaces
		
		double sold = Double.parseDouble(sld);//transformer chaine en int
		
		Compte cp1 = new Compte(num, sold);//instanciation Compte
		System.out.println("Nom du client: "+cp1.getNumCompte()+ "\nPrénom du client: "+cp1.getSolde());
	}

}
