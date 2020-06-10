package entites;

//Création de la classe personne
public class Personne {

		   String nom;
	       String prenom;
	public AdressePostale adr;
	
	//Un constucteur à la classe Personne avec les paramètres permettant de valorisez nom et prénom.
	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	//Un constucteur à la classe Personne avec les paramètres permettant de valoriser les attributs nom, prenom et adresse
	public Personne(String nom, String prenom, AdressePostale adr) {
		this.nom = nom;
		this.prenom = prenom;
		this.adr = adr;
	}

}
