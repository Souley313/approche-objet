/**
 * 
 */
package fr.diginamic.testenumeration;

/**
 * @author souleymaneTHIAM
 *
 */
public enum Continent {
	
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

	private String nomContinent;

	Continent(String nomContinent) {
		this.nomContinent  = nomContinent;
	}
	
}
