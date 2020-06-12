/**
 * 
 */
package fr.diginamic.formes;

/**
 * la classe mère de diverses formes géométriques
 * @author Souleymane THIAM
 *
 */
public abstract class Forme {

	/**
	 * Retourne la surface d’une forme géométrique
	 * @return double
	 */
	public abstract double surface();

	/**
	 * Retourne le périmètre d’une forme géométrique
	 * 
	 * @return double
	 */
	public abstract double perimetre();

}
