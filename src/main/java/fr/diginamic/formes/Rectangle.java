/**
 * 
 */
package fr.diginamic.formes;

/**
 * La classe Rectangle qui hérite de Forme
 * @author Souleymane THIAM
 *
 */
public class Rectangle extends Forme {
	
	private double longeur; // longeur du triangle
	private double largeur; // largeur du triangle
	
	/**Constructeur d'un rectangle
	 * @param longeur
	 * @param largeur
	 */
	public Rectangle(double longeur, double largeur) {
		this.longeur = longeur;
		this.largeur = largeur;
	}
	
	public Rectangle() {};
	
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

	/**
	 * @return the largeur
	 */
	public double getLargeur() {
		return largeur;
	}

	/**
	 * @param largeur the largeur to set
	 */
	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}


	@Override
	public double surface() {//Retourne la surface d’une rectangle
		// TODO Auto-generated method stub
		return longeur * largeur;
	}

	@Override
	public double perimetre() {//Retourne le pérmètre d’une rectangle
		// TODO Auto-generated method stub
		return 2 * (longeur + largeur);
	}

	@Override
	public String toString() {
		return "Rectangle [longeur =" + longeur + ", largeur =" + largeur + ", surface() =" + surface() + ", perimetre() ="
				+ perimetre() + "]";
	}
	
}
