/**
 * 
 */
package fr.diginamic.salaire;

/**
 * La classe Intervenant représentant la classe mère des diverses personnes 
 * travaillant pour le journal
 * @author Souleymane THIAM
 *
 */
public abstract class Intervenant {
	
	private String nom;
	private String prenom;
	
	/**
	 * @param nom
	 * @param prenom
	 */
	public Intervenant(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
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
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	//méthode abstraite getSalaire qui retourne le salaire des intervenants
	public abstract double getSalaire();
	
	//
	public abstract void afficherDonnees();

}
