/**
 * 
 */
package fr.diginamic.formes;

/**
 * La classe Carre qui hérite de Rectangle
 * @author Souleymane THIAM
 *
 */
public class Carre extends Rectangle {
	
	private double longeur; // longeur du triangle
	
	/**
	 * @param longeur
	 * @param largeur
	 */
	public Carre(double longeur) {
		//super(longeur);
		// TODO Auto-generated constructor stub
		this.longeur = longeur;
	}

	/**
	 * @return the longeur
	 */
	public double getLongeur() {
		return longeur;
	}

	/**
	 * @param longeur the longeur to set
	 */
	public void setLongeur(double longeur) {
		this.longeur = longeur;
	}
    
	@Override
	public double surface() {//Retourne la surface d’une rectangle
		// TODO Auto-generated method stub
		return longeur * longeur;
	}

	@Override
	public double perimetre() {//Retourne le pérmètre d’une rectangle
		// TODO Auto-generated method stub
		return 2 * (longeur + longeur);
	}

	@Override
	public String toString() {
		return "Carre [Coté= " + longeur + ", surface()= " + surface() + ", perimetre() =" + perimetre() + "]";
	}
	
	
}
