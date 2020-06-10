package entites;
/**
 * @author Souleymane THIAM
 * 
 * Création de la classe personne
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
	public void afficheNomPrenom() {
		System.out.println("Nom: " +nom.toUpperCase() + " Prénom: " +prenom);
	}

	/**
	 * méthode qui prend un argument en paramètre et permet de modifier la variable
	 * d’instance nom de Personne
	 */
	public void modifNom(String nvNom) {
		nom = nvNom;
	}

	/**
	 * méthode qui prend un argument en paramètre et permet de modifier la variable
	 * d’instance prenom de Personne
	 */
	public void modifPrenom(String nvPrenom) {
		prenom = nvPrenom;
	}
	
	/**
	 * méthode qui prend un argument en paramètre et permet de modifier l'adresse
	 */
	public void modifAdresse(int numRue, String libelleVoie, int codePostal, String ville) {
		adr.numRue = numRue;
		adr.libelleVoie = libelleVoie;
		adr.codePostal = codePostal;
		adr.ville = ville;
	}
	
	/**
	 * Méthode qui retourne le nom.
	 */
	public void afficheNom() {
		System.out.println("Nom : " +nom);
	}
	
	/**
	 * Méthode qui retourne le prenom.
	 */
	public void affichePreom() {
		System.out.println("Prenom : " +prenom);
	}
	
	/**
	 * Méthode qui retourne le prenom.
	 * @return 
	 */
	public void afficheAdresse() {
		
		System.out.println("Adresse: " +adr.numRue  + adr.libelleVoie + adr.codePostal + adr.ville);
	}
	
	
}
