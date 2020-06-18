/**
 * 
 */
package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.List;

/**
 * La classe de recensement qui possède toutes les villes
 * @author souleymaneTHIAM
 *
 */
public class Recensement {
	
	/**Liste de ville*/
	private List<Ville> villes =  new ArrayList<Ville>() ;


	/**
	 * @return the villes
	 */
	public List<Ville> getVilles() {
		return villes;
	}

	/**
	 * @param villes the villes to set
	 */
	public void setVilles(List<Ville> villes) {
		this.villes = villes;
	}

}
