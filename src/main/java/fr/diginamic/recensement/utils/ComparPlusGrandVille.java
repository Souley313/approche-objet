/**
 * 
 */
package fr.diginamic.recensement.utils;

import java.util.Comparator;

import fr.diginamic.recensement.Ville;

/**
 * @author souleymaneTHIAM
 *
 */
public class ComparPlusGrandVille implements Comparator<Ville> {

	/**
	 * Cette methode compare deux villes v1 et v2 par rapport à leur nombre
	 * d'habitants: 
	 * Si v2 est plus peuplé Retourne 1  
	 * Si v1 est plus
	 * peuplé Retourne -1  
	 * Sinon Retourne 0 
	 * 
	 * 
	 */

	@Override
	public int compare(Ville v1, Ville v2) {
		// TODO Auto-generated method stub
		if (v1.getPopulation() < v2.getPopulation()) {
			return 1;
		} else if (v1.getPopulation() > v2.getPopulation()) {
			return -1;
		}
		return 0;
	}

}
