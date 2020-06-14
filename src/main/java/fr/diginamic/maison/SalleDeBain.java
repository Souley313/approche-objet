/**
 * 
 */
package fr.diginamic.maison;

/**
 * La classe représentant une salle de bain
 * @author Souleymane THIAM
 *
 */
public class SalleDeBain extends Piece {

	/**
	 * @param superficie
	 * @param numEtage
	 */
	public SalleDeBain(double superficie, int numEtage) {
		super(superficie, numEtage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object getType() {
		// TODO Auto-generated method stub
		return SALLE_DE_BAIN;
	}
	
}
