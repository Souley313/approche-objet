/**
 * 
 */
package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Classe permettant de faire des test sur les dates avec  Date
 * @author souleymaneTHIAM
 *
 */
public class TestDates {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("deprecation")
		Date date1 = new Date(120, 5, 19);//une instance d'un objet Date date1
		SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");//Formatage de notre objet date1
		System.out.println(format1.format(date1));
		
		@SuppressWarnings("deprecation")
		Date date2 = new Date(116, 4, 19, 23, 59, 30);
		SimpleDateFormat format2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(format2.format(date2));
		
		Date systeme = new Date();
		System.out.println(format2.format(systeme));

	

		
	}

}
