/**
 * 
 */
package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

/**
 * @author Souleymane THIAM
 *
 */
public class TestIntervenant {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Salarie salarie = new Salarie("Thiam", "Souleymane");
		salarie.setMontantSalaire(1200);
		salarie.setTypeContrat("CDI");
		
		double salaireS = salarie.getSalaire();
		System.out.println("Le salarié a "+salaireS+"euros par mois\n");
		
		Pigiste pigiste = new Pigiste("Beggache", "Liamine");
		pigiste.setMontantJr(45);
		pigiste.setNombreJrTrav(22);
		
		double salaireP = pigiste.getSalaire();
		System.out.println("Le Pigiste a "+salaireP+"euros pour ce mois\n");
		
		//Affichage des informations concernant notre salarié
		salarie.afficherDonnees();
		
		System.out.println("-------------");
		
		//Affichage des informations concernant notre salarié
		pigiste.afficherDonnees();

	}

}
