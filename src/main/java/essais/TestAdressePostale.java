package essais;

import entites.AdressePostale;

public class TestAdressePostale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdressePostale ap1 = new AdressePostale();
		ap1.numRue = 5;
		ap1.libelleVoie = "des Maréchaux";
		ap1.codePostal = 44100;
		ap1.ville = "Nantes";
		
		AdressePostale ap2 = new AdressePostale();
		ap2.numRue = 85;
		ap2.libelleVoie = "d’Antrain";
		ap2.codePostal = 35700;
		ap2.ville = "Rennes";


	}

}
