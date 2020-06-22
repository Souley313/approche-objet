/**
 * 
 */
package fr.diginamic.recensement;

/** Classe département
 * @author souleymaneTHIAM
 *
 */
public class Departement {
	
	/**Code département*/
	private String codeDep;
	/**Population département*/
	private int population;
	
	/**
	 * Constructeur de département
	 * @param codeDep
	 * @param population
	 */
	public Departement(String codeDep, int population) {
		this.codeDep = codeDep;
		this.population = population;
	}
	
	/**
	 * @return the codeDep
	 */
	public String getCodeDep() {
		return codeDep;
	}
	
	/**
	 * @param codeDep the codeDep to set
	 */
	public void setCodeDep(String codeDep) {
		this.codeDep = codeDep;
	}
	
	/**
	 * @return the population
	 */
	public int getPopulation() {
		return population;
	}
	
	/**
	 * @param population the population to set
	 */
	public void setPopulation(int population) {
		this.population = population;
	}
	
	@Override
	public String toString() {
		return "Code département= " + getCodeDep() + ", Nombre d'habitants= " + getPopulation() ;
	}
	
}
