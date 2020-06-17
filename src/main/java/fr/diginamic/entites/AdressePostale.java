package fr.diginamic.entites;

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

	public int getNumRue() {
		return numRue;
	}

	public void setNumRue(int numRue) {
		this.numRue = numRue;
	}

	public String getLibelleVoie() {
		return libelleVoie;
	}

	public void setLibelleVoie(String libelleVoie) {
		this.libelleVoie = libelleVoie;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}


}

