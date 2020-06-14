/**
 * 
 */
package fr.diginamic.maison;

/**
 * La classe Pièce, classe mère des différentes pièces de la maison
 * @author Souleymane
 *
 */
public abstract class Piece {
	
	private double superficie;
	private int numEtage;
	/**
	 * @param superficie
	 * @param numEtage
	 */
	public Piece(double superficie, int numEtage) {
		this.superficie = superficie;
		this.numEtage = numEtage;
	}
	/**
	 * @return the superficie
	 */
	public double getSuperficie() {
		return superficie;
	}
	/**
	 * @param superficie the superficie to set
	 */
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}
	/**
	 * @return the numEtage
	 */
	public int getNumEtage() {
		return numEtage;
	}
	/**
	 * @param numEtage the numEtage to set
	 */
	public void setNumEtage(int numEtage) {
		this.numEtage = numEtage;
	}
	
	//les différents type de pièces
	public static final String CHAMBRE = "Chambre";
	public static final String SALON = "Salon";
	public static final String CUISINE = "Cuisine";
	public static final String WC = "WC";
	public static final String SALLE_DE_BAIN = "Salle de bain";
	public abstract Object getType();
	
}
