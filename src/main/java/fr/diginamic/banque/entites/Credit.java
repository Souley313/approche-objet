package fr.diginamic.banque.entites;

/**
 * La classe Crédit qui hérite de opération
 * @author Souleymane THIAM
 *
 */
public class Credit extends Operation {

	public Credit(String date, double montant) {
		super(date, montant);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String afficherType() {
		// TODO Auto-generated method stub
		return "Crédit";
	}

}
