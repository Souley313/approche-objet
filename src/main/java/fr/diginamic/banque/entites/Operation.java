/**
 * 
 */
package fr.diginamic.banque.entites;

/**
 * @author Souleymane THIAM
 *
 */
public abstract class Operation {
	
	/**Date de l'opération*/
	private String date;
	/**Montant de l'opération*/
	private double montant;
	
	/**
	 * @param date
	 * @param montantOp
	 */
	public Operation(String date, double montant) {
		//super();
		this.date = date;
		this.montant = montant;
	}

	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * @return the montantOp
	 */
	public double getMontant() {
		return montant;
	}

	/**
	 * @param montantOp the montantOp to set
	 */
	public void setMontant(double montant) {
		this.montant = montant;
	}
	
	public abstract String afficherType();

	@Override
	public String toString() {
		return "date de l'opération=" + date + ", montant opération=" + montant ;
	}
}
