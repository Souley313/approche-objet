/**
 * 
 */
package fr.diginamic.banque;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

/**
 * @author Souleymane THIAM
 *
 */
public class TestOperation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Credit op1 = new Credit("22/09/19", 50);
		Debit op2 = new Debit("01/11/19", 150);
		Credit op3 = new Credit("10/12/19", 70);
		Debit op4 = new Debit("20/01/20", 100);
		
		Operation[] operations = {op1,op2,op3,op4};
		
		double res = 0;
		for(int i=0 ; i < operations.length ; i++) {
			String type = operations[i].afficherType();
			double montant = operations[i].getMontant();
			System.out.println("Informations du compte au date "+operations[i].getDate()+"\nOpération effectuée : "+type+ "\nmontant : "+montant+"€\n");
			if(type=="Crédit") {
				res += montant;
			}
			else {
				res -= montant;
			}
		}

		System.out.println("Montant global : "+res+"€");
		}
	
}
