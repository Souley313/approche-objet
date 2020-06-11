/**
 * 
 */
package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

/**
 * @author Souleymane THIAM
 *
 */
public class TestBanque {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Compte compte1 = new Compte(1, 500); // Instanciation d'un compte
		CompteTaux compte2 = new CompteTaux(2, 800, 5); // Instanciation d'un compte avec un atux de renumération

		// System.out.println( compte1 );
		// System.out.println( compte2 );

		Compte [] comptes = {compte1, compte2};
		

		for (int i = 0; i < comptes.length; i++) {
			System.out.println(comptes[i]);
		}

	}
}
