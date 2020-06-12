/**
 * 
 */
package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

/**
 * @author Souleymane THIAM
 *
 */
public class TestOperations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a=4, b=2;
		
		double op1 = Operations.calcul(a, b, '+');
		System.out.println(op1);
		
		double op2 = Operations.calcul(a, b, '-');
		System.out.println(op2);
		
		double op3 = Operations.calcul(a, b, '*');
		System.out.println(op3);
		
		double op4 = Operations.calcul(a, b, '/');
		System.out.println(op4);

	}

}
