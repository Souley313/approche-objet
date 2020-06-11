package utils;

/**
 * La classe Cercle
 * @author Souleymane THIAM
 *
 */
public class Cercle implements ObjetGeometrique {

	double rayon; // rayon du cercle

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
	public double perimetre() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * rayon;
	}

	@Override
	public double surface() {
		// TODO Auto-generated method stub
		return Math.PI * rayon;
	}

	@Override
	public String toString() {
		return "Rayon du cercle= " + rayon + ", toString()=" + super.toString();
	}
	
	
}
