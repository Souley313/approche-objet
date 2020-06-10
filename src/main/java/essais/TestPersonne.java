package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Personne pers1 = new Personne("THIAM", "Souleymane");
		
		
		
		//Utilisation du second constructeur de la classe Personne.
		AdressePostale adr = new AdressePostale (5, "des Maréchaux",44100,"Nantes");
		Personne pers2 = new Personne("Bonnamy", "Richard",adr);
		//oubien pers2.adr = new AdressePostale(5, "des Maréchaux",44100,"Nantes");
	

	}

}
