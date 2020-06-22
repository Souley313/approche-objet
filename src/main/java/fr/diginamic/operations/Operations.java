/**
 * 
 */
package fr.diginamic.operations;

/**
 * Classe pour faire des calcul sur deux variables de type double
 * @author Souleymane THIAM
 *
 */
public class Operations {
	
	public static double calcul(double a,double b, char operation) {
		double res = 0;
		if (operation == '+'){
			res = a+b;
		}else if (operation == '-') {
			res = a-b;
		} else if (operation == '*') {
			res = a*b;
		} else if (operation == '/') {
			res = a/b;
		} 
		return res;
	}
}
