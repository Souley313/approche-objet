/**
 * 
 */
package fr.diginamic.salaire;

/**
 * @author Souleymane THIAM
 *
 */
public class Pigiste extends Intervenant {
	
	private int nombreJrTrav;
	private double montantJr;
	
	public Pigiste(String nom, String prenom) {
		super(nom, prenom);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @return the nombreJrTrav
	 */
	public int getNombreJrTrav() {
		return nombreJrTrav;
	}

	/**
	 * @param nombreJrTrav the nombreJrTrav to set
	 */
	public void setNombreJrTrav(int nombreJrTrav) {
		this.nombreJrTrav = nombreJrTrav;
	}

	/**
	 * @return the montantJr
	 */
	public double getMontantJr() {
		return montantJr;
	}

	/**
	 * @param montantJr the montantJr to set
	 */
	public void setMontantJr(double montantJr) {
		this.montantJr = montantJr;
	}

	@Override
	public double getSalaire() {
		// TODO Auto-generated method stub
		double montantSalaire = nombreJrTrav*montantJr;
		return montantSalaire;
	}

	@Override
	public void afficherDonnees() {
		// TODO Auto-generated method stub
		System.out.println("Les données du pigiste:\nNom: "+getNom()+"\nPrénom: "+ getPrenom()+ "\nSalaire: "+getSalaire());		
	}

}
