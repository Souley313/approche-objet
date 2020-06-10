package essais;

import entites.*;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Personne pers1 = new Personne();
		pers1.nom = "Souleymane";
		pers1.prenom = "THIAM";
		
		pers1.adr = new AdressePostale();
		
		pers1.adr.numRue = 22;
		pers1.adr.libelleVoie = "rue de Graville";
		pers1.adr.codePostal = 76600;
		pers1.adr.ville = "Le Havre";
		

	}

}
