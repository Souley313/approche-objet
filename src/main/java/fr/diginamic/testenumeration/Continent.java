/**
 * 
 */
package fr.diginamic.testenumeration;

/**
 * Classe énumration Continent 
 * @author souleymaneTHIAM
 *
 */
public enum Continent {
	/**énumérer les champs*/
	 EUROPE("Europe"), 
	 AMERIQUE("Amérique"), 
	 ASIE("Asie"), 
	 AFRIQUE("Afrique"), 
	 OCEANIE("Océanie") ;
	
	/**
	 * @return the nomContinent
	 */
	public String getNomContinent() {
		return nomContinent;
	}

	/**
	 * @param nomContinent the nomContinent to set
	 */
	public void setNomContinent(String nomContinent) {
		this.nomContinent = nomContinent;
	}

	/**Variable d'état interne*/
	private String nomContinent;

	/**Constructeur de continent*/
	Continent(String nomContinent) {
		this.nomContinent  = nomContinent;
	}
	
}
