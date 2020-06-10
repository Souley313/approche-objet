package entites;

public class AdressePostale {
	
	int numRue; 
	String libelleVoie;
	int codePostal ;
	String ville;
	
	public AdressePostale() {
	}
	
	public AdressePostale(int numRue, String libelleVoie, int codePostal, String ville) {
		this.numRue = numRue;
		this.libelleVoie = libelleVoie;
		this.codePostal = codePostal;
		this.ville = ville;
		
	}


}

