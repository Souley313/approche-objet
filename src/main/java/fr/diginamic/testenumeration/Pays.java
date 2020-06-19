package fr.diginamic.testenumeration;

public class Pays {

	/** nom */
	private String nom;
	/** nbHabitant */
	private int nbHabitant;
	/** pibParHabitant */
	private int pibParHabitant;
	/**nom de continent*/
	private Continent nomContinent;

	/**
	 * @param nom
	 * @param nbHabitant
	 * @param pibParHabitant
	 * @param nomContinent
	 */
	public Pays(String nom, int nbHabitant, int pibParHabitant, Continent nomContinent) {
		this.nom = nom;
		this.nbHabitant = nbHabitant;
		this.pibParHabitant = pibParHabitant;
		this.nomContinent = nomContinent;
	}



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
	 * @return the nbHabitant
	 */
	public int getNbHabitant() {
		return nbHabitant;
	}



	/**
	 * @param nbHabitant the nbHabitant to set
	 */
	public void setNbHabitant(int nbHabitant) {
		this.nbHabitant = nbHabitant;
	}



	/**
	 * @return the pibParHabitant
	 */
	public int getPibParHabitant() {
		return pibParHabitant;
	}



	/**
	 * @param pibParHabitant the pibParHabitant to set
	 */
	public void setPibParHabitant(int pibParHabitant) {
		this.pibParHabitant = pibParHabitant;
	}



	/**
	 * @return the nomContinent
	 */
	public Continent getNomContinent() {
		return nomContinent;
	}



	/**
	 * @param nomContinent the nomContinent to set
	 */
	public void setNomContinent(Continent nomContinent) {
		this.nomContinent = nomContinent;
	}



	@Override
	public String toString() {
		return "nom de pays=" + nom + ", nbHabitant=" + nbHabitant + ", pibParHabitant=" + pibParHabitant
				+ ", nomContinent=" + nomContinent ;
	}
	

}
