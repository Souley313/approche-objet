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
public class ComparPlusPetitVille implements Comparator<Ville> {

	/**
	 * Cette methode compare deux villes v1 et v2 par rapport à leur nombre
	 * d'habitants 
	 *  si v2 est plus peuplé Retourne 1
	 *  si v1 est plus peuplé Retourne -1
	 *  Sinon Retourne 0
	 * 
	 * 
	 */

	@Override
	public int compare(Ville o1, Ville o2) {
		// TODO Auto-generated method stub
		if (o1.getPopulation() > o2.getPopulation()) {
			return 1;
		} else if (o1.getPopulation() < o2.getPopulation()) {
			return -1;
		}
		return 0;
	}

}
