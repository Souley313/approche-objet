/**
 * 
 */
package fr.diginamic.maison;

/**
 * La classe représentant une salon
 * @author Souleymane THIAM
 *
 */
public class Salon extends Piece {

	/**
	 * @param superficie
	 * @param numEtage
	 */
	public Salon(double superficie, int numEtage) {
		super(superficie, numEtage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object getType() {
		// TODO Auto-generated method stub
		return SALON;
	}
	
}
