package fr.diginamic.entites;

/**
 * @author Souleymane THIAM
 * 
 *         Création de la classe personne
 *
 */
public class Personne {

	String nom;
	String prenom;
	AdressePostale adr;

	/**
	 * Un constucteur à la classe Personne avec les paramètres permettant de
	 * valorisez nom et prénom.
	 */
	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	/**
	 * Un constucteur à la classe Personne avec les paramètres permettant de
	 * valoriser les attributs nom, prenom et adresse
	 */
	public Personne(String nom, String prenom, AdressePostale adr) {
		this.nom = nom;
		this.prenom = prenom;
		this.adr = adr;
	}

	/**
	 * Méthode permettant d’afficher le nom et le prénom avec le nom de famille en
	 * majuscules
	 */
	public void afficherIdentite() {
		System.out.println("Nom: " + nom.toUpperCase() + " Prénom: " + prenom);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public AdressePostale getAdr() {
		return adr;
	}

	public void setAdr(AdressePostale adr) {
		this.adr = adr;
	}

}
