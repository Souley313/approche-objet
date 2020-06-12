/**
 * 
 */
package fr.diginamic.essais;

import fr.diginamic.formes.Forme;

/**
 * @author Souleymane THIAM
 *
 */
public class AffichageForme {
	
	public static void afficher(Forme forme) {
		System.out.println("Périmètre= "+forme.perimetre());
		System.out.println("Surface= "+forme.surface());
	}

}
