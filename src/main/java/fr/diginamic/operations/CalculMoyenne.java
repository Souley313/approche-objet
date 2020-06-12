/**
 * 
 */
package fr.diginamic.operations;

import java.util.Arrays;

/**
 * @author Souleymane THIAM
 *
 */
public class CalculMoyenne {

	private double [] elmts;
	
	/**
	 * constructeur de la classe CalculMoyenne qui n’a pas de paramètre
	 */
	public CalculMoyenne() {
	}
	
	public double[] getElmts() {
		return elmts;
	}

	public void setElmts(double[] elmts) {
		this.elmts = elmts;
	}
	
	//Ajout d'un élèment dans un tableau
	public static double[] ajout( double[] elmts, double nvElmt) {
		double [] nvElmts = new double[elmts.length+1];
		for (int i=0; i<elmts.length; i++) {
			nvElmts[i] = elmts[i];
		}
		// ajout du nouveau élèment dans la dernière case
		nvElmts[elmts.length] = nvElmt;
		elmts = nvElmts;
		return nvElmts;
	}
	
	
	public static double calcul (double[] elmts) {
		double som=0;
		double moy=0;
		for (int i=0; i<elmts.length; i++) {
			som += elmts[i];
			moy = som/elmts.length;
		}
		return moy;
	}

	@Override
	public String toString() {
		return "CalculMoyenne [elmts=" + Arrays.toString(elmts) + "]";
	}
	
}
