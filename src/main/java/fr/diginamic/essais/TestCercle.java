/**
 * 
 */
package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

/**
 * @author Souleymane THIAM
 *
 */
public class TestCercle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Avec la classe Cercle");
		Cercle [] cercles = {new Cercle(2.0),new Cercle(3.1)};
		for (int i=0; i<cercles.length; i++) {
			System.out.println("Le cercle "+i+ ": \n périmètre " +cercles[i].perimetre()+" \n surface "+cercles[i].surface()+"\n");
		}
		
		System.out.println("Avec la classe CercleFactory");
		Cercle [] cercles1 = {CercleFactory.creerCercle(1.5),CercleFactory.creerCercle(2.3)};
		for (int i=0; i<cercles1.length; i++) {
			System.out.println("Le cercle "+i+ ": \n périmètre " +cercles1[i].perimetre()+" \n surface "+cercles1[i].surface());
		}
	}

}
