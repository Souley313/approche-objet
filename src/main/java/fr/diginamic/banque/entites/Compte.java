/**
 * 
 */
package fr.diginamic.banque.entites;


/**
 * @author Souleymane THIAM
 *
 */
public class Compte {
	
	private int numCompte; // numéro du compte
	private double solde;  // solde du compte
	/**
	 * @return the numCompte
	 */
	public int getNumCompte() {
		return numCompte;
	}
	/**
	 * @param numCompte the numCompte to set
	 */
	public void setNumCompte(int numCompte) {
		this.numCompte = numCompte;
	}
	/**
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}
	/**
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}
	/**
	 * @param numCompte
	 * @param solde
	 */
	public Compte(int numCompte, double solde) {
		super();
		this.numCompte = numCompte;
		this.solde = solde;
	}
	
	@Override
	public String toString() {
		return "Numéro de Compte= " + numCompte + ", solde= " + solde ;
	}

}
