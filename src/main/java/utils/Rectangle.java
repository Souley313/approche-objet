package utils;

/**
 * La classe Rectangle
 * @author Souleymane THIAM
 *
 */
public class Rectangle implements ObjetGeometrique {

	double longeur; // longeur du triangle
	double largeur; // largeur du triangle

	/**
	 * @param longeur
	 * @param largeur
	 */
	public Rectangle(double longeur, double largeur) {
		super();
		this.longeur = longeur;
		this.largeur = largeur;
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
	public double perimetre() {//Retourne le périmètre d'un rectangle
		// TODO Auto-generated method stub
		return (longeur + largeur) * 2;
	}

	@Override
	public double surface() {//Retourne la surface d'un rectangle
		// TODO Auto-generated method stub
		return longeur * largeur;
	}
	
	

}
