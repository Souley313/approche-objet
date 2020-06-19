/**
 * 
 */
package fr.diginamic.dates;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

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
		cal.set(Calendar.YEAR, 2016);
		cal.set(Calendar.MONTH, 4);
		cal.set(Calendar.DAY_OF_MONTH, 19);
		cal.set(Calendar.HOUR, 23);
		cal.set(Calendar.MINUTE, 59);
		cal.set(Calendar.SECOND, 30);
		
		Date date = cal.getTime();
		
		SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd/MM/yyyy");
		String date1 = simpleDateFormat1.format(date);
		System.out.println("La date du : " + date1);

		Calendar cal1 = Calendar.getInstance();
		DateFormat dateFormat1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println("La date du jour: "+dateFormat1.format(cal1.getTime()));
		

	}

}
