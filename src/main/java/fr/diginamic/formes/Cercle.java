/**
 * 
 */
package fr.diginamic.formes;

/**
 * La classe cercle qui hérite de la abstraite Forme
 * @author Souleymane THIAM
 *
 */
public class Cercle extends Forme {

	double rayon; // rayon du cercle

	/**
	 * @param rayon
	 */
	public Cercle(double rayon) {
		this.rayon = rayon;
	}

	/**
	 * @return the rayon
	 */
	public double getRayon() {
		return rayon;
	}

	/**
	 * @param rayon the rayon to set
	 */
	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

	@Override
	public double surface() {//Retourne la surface d'un cercle
		// TODO Auto-generated method stub
		return Math.PI * rayon * rayon;
	}

	@Override
	public double perimetre() {//Retourne le périmètre d'un cercle
		// TODO Auto-generated method stub
		return 2 * Math.PI * rayon;
	}

}
