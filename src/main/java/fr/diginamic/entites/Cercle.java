/**
 * 
 */
package fr.diginamic.entites;

/**
 * Une classe cercle
 * @author Souleymane THIAM
 *
 */
public class Cercle {
	
	private Double rayon;

	public Cercle(Double rayon) {
		this.rayon = rayon;
	}
	
	public double perimetre() {//Retourne le périmètre d'un cercle
		return 2 * Math.PI * rayon;
	}
	
	public double surface() {//Retourne la surface d'un cercle
		return Math.PI * rayon * rayon;
	}

	public Double getRayon() {
		return rayon;
	}

	public void setRayon(Double rayon) {
		this.rayon = rayon;
	}

	@Override
	public String toString() {
		return "Cercle [rayon=" + rayon + ", perimetre()=" + perimetre() + ", surface()=" + surface() + "]";
	}

}
