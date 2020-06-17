/**
 * 
 */
package fr.diginamic.maps;



/**
 * @author formation
 *
 */
public class Pays {

	/** nom */
	public String nom;
	/** nbHabitant */
	public int nbHabitant;
	/** pibParHabitant */
	public int pibParHabitant;

	/**
	 * Constructeur
	 * 
	 * @param nom
	 * @param nbHabitant
	 * @param pibParHabitant
	 */
	public Pays(String nom, int nbHabitant, int pibParHabitant) {
		this.nom = nom;
		this.nbHabitant = nbHabitant;
		this.pibParHabitant = pibParHabitant;
	}

	@Override
	public String toString() {
		return "Pays =" + nom + ", nombre d'habitants =" + nbHabitant + ", PIB/hab" + pibParHabitant + "PIB total = "
				+ nbHabitant * pibParHabitant;
	}

	/**
	 * Getter
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter
	 * 
	 * @return the nbHabitant
	 */
	public int getNbHabitant() {
		return nbHabitant;
	}

	/**
	 * Setter
	 * 
	 * @param nbHabitant the nbHabitant to set
	 */
	public void setNbHabitant(int nbHabitant) {
		this.nbHabitant = nbHabitant;
	}

	/**
	 * Getter
	 * 
	 * @return the pibParHabitant
	 */
	public double getPibParHabitant() {
		return pibParHabitant;
	}

	/**
	 * Setter
	 * 
	 * @param pibParHabitant the pibParHabitant to set
	 */
	public void setPibParHabitant(int pibParHabitant) {
		this.pibParHabitant = pibParHabitant;
	}
	

}
