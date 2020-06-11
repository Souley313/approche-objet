package fr.diginamic.banque.entites;

/**
 * @author Souleymane THIAM
 *
 */
public class CompteTaux extends Compte {
	
	private double tauxRenum;
	
	/**
	 * @param numCompte
	 * @param solde
	 * @param tauxRenum
	 */
	public CompteTaux(int numCompte, double solde, double tauxRenum) {
		super(numCompte, solde);
		this.tauxRenum = tauxRenum;
	}
	
	/**
	 * @return the tauxRenum
	 */
	public double getTauxRenum() {
		return tauxRenum;
	}

	/**
	 * @param tauxRenum the tauxRenum to set
	 */
	public void setTauxRenum(double tauxRenum) {
		this.tauxRenum = tauxRenum;
	}

	@Override
	public String toString() {
		return "CompteTaux ["+super.toString()+" tauxRenum=" + tauxRenum + "]";
	}
	
}
