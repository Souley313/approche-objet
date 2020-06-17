package fr.diginamic.utils;

/**
 * La classe Cercle
 * @author Souleymane THIAM
 *
 */
public class Cercle implements ObjetGeometrique {
	
	private double rayon; //Rayon du cercle
	
	/**
	 * @param rayon
	 */
	public Cercle(double rayon) {
		super();
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
	public double perimetre() {//Retourne le périmètre d'un cercle
		// TODO Auto-generated method stub
		return 2 * Math.PI * rayon;
	}

	@Override
	public double surface() {//Retourne la surface d'un cercle
		// TODO Auto-generated method stub
		return Math.PI * rayon * rayon;
	}	
	
}
