/**
 * 
 */
package fr.diginamic.dates;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author souleymaneTHIAM
 *
 */
public class TestCalendar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar cal = Calendar.getInstance();
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println(dateFormat.format(cal.getTime()));

		Calendar cal1 = Calendar.getInstance();
		DateFormat dateFormat1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println(dateFormat1.format(cal1.getTime()));
		

	}

}
