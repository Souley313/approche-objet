/**
 * 
 */
package fr.diginamic.maison;

/**
 * La classe représentant une chambre
 * @author Souleymane THIAM
 *
 */
public class Chambre extends Piece {

	/**
	 * @param superficie
	 * @param numEtage
	 */
	public Chambre(double superficie, int numEtage) {
		super(superficie, numEtage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return CHAMBRE;
	}


	
}
