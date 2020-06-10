package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		//Utilisation du second constructeur de la classe Personne.
		AdressePostale adr = new AdressePostale (5, " des Maréchaux ",44100," Nantes ");
		Personne pers2 = new Personne(" Bonnamy ", " Richard ",adr);
		//oubien pers2.adr = new AdressePostale(5, "des Maréchaux",44100,"Nantes");
		
		pers2.afficherIdentite();
		 
		
		AdressePostale adr2 = new AdressePostale (55, " de Graville ", 76600, " Le Havre ");
		
		
		

	}

}
