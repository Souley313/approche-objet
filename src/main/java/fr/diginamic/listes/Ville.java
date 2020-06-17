/**
 * 
 */
package fr.diginamic.listes;

/**
 * @author souleymaneTHIAM
 *
 */
public class Ville {
	
	String nom;
	int nbreHts;

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the nbreHts
	 */
	public int getNbreHts() {
		return nbreHts;
	}

	/**
	 * @param nbreHts the nbreHts to set
	 */
	public void setNbreHts(int nbreHts) {
		this.nbreHts = nbreHts;
	}

	public Ville(String nom, int nbreHts) {
		super();
		this.nom = nom;
		this.nbreHts = nbreHts;
	}

	@Override
	public String toString() {
		return "Ville " + nom + ", nbHabitants=" + nbreHts + " \n";
	}

}
