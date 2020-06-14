/**
 * 
 */
package fr.diginamic.maison;

/**
 * La classe représentant un WC
 * 
 * @author Souleymane THIAM
 *
 */
public class WC extends Piece {

	/**
	 * @param superficie
	 * @param numEtage
	 */
	public WC(double superficie, int numEtage) {
		super(superficie, numEtage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object getType() {
		// TODO Auto-generated method stub
		return WC;
	}

}
