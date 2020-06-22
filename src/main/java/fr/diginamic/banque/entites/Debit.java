/**
 * 
 */
package fr.diginamic.banque.entites;

/**
 * La classe Débit qui hérite de opération
 * @author Souleymane THIAM
 *
 */
public class Debit extends Operation {

	public Debit(String date, double montant) {
		super(date, montant);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String afficherType() {
		// TODO Auto-generated method stub
		return "Débit";
	}

}
