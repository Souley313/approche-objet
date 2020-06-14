/**
 * 
 */
package fr.diginamic.maison;

/**
 * La classe représentant une cuisine
 * @author Souleymane THIAM
 *
 */
public class Cuisine extends Piece {

	/**
	 * @param superficie
	 * @param numEtage
	 */
	public Cuisine(double superficie, int numEtage) {
		super(superficie, numEtage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object getType() {
		// TODO Auto-generated method stub
		return CUISINE;
	}
	

}
