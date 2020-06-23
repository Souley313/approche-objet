/**
 * 
 */
package fr.diginamic.maison;

/**
 * La classe représentant une maison
 * 
 * @author Souleymane THIAM
 *
 */
public class Maison {

	private Piece[] pieces; // Tableau de pièces
	
	/**
	 * Constructeur
	 */
	public Maison(){
		// Initialisation du tableau de pièces
		pieces = new Piece[0];
	}

	/**
	 * @param pieces
	 */
	public Maison(Piece[] pieces) {
		this.pieces = pieces;
	}

	/**
	 * @return the pieces
	 */
	public Piece[] getPieces() {
		return pieces;
	}

	/**
	 * @param pieces the pieces to set
	 */
	public void setPieces(Piece[] pieces) {
		this.pieces = pieces;
	}

	// Méthode permettant d’ajouter une pièce à la maison
	public void  ajouterPiece(Piece nvlPiece) {

		if (nvlPiece == null || nvlPiece.getNumEtage() < 0 || nvlPiece.getSuperficie() < 0) {
			System.out.println("Veuillez entrer une pièce valable");
			return  ;
		}

		// On créer un tableau temporaire appelé tmp qui a une taille égale à la tableau
		// du tableau pieces+1
		Piece[] tmp = new Piece[pieces.length + 1];

		// copie du tableau pieces dans tmp
		for (int i = 0; i < pieces.length; i++) {
			tmp[i] = pieces[i];
		}

		tmp[tmp.length - 1] = nvlPiece;

		this.pieces = tmp;
	}

	// Méthode qui retourne la superficie totale de la maison
	public double superficieTot() {
		double supTotal = 0;

		for (int i = 0; i < pieces.length; i++) {
			supTotal += pieces[i].getSuperficie();
		}
		return supTotal;
	}

	// Méthode qui prend en paramètre un type de pièce donné et retourne la superficie d'un étage donné de la maison
	public double superficieEtage(int numEtage) {
		double supEtage = 0;
		for (int i = 0; i < pieces.length; i++) {
			if (numEtage == pieces[i].getNumEtage()) {
				supEtage += pieces[i].getSuperficie();
			}
		}
		return supEtage;
	}

	// Methode qui retourne la superficie globale pour ce type de pièce donné
	public double superficieTotTypePiece(String typeP) {
		double supTotTyp = 0;

		for (int i = 0; i < pieces.length; i++) {
			if (typeP != null && typeP.equals(this.pieces[i].getType())) {
				supTotTyp = supTotTyp + this.pieces[i].getSuperficie();
			}
		}
		return supTotTyp;
	}
	
	// Methode qui retourne la superficie globale pour ce type de pièce donné
		public int nmbrePieceTyp(String typeP) {
			int nmbreP = 0;

			for (int i = 0; i < pieces.length; i++) {
				if (typeP != null && typeP.equals(this.pieces[i].getType())) {
					nmbreP++;
				}
			}
			return nmbreP;
		}
}
