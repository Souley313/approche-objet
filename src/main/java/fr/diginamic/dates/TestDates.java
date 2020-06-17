/**
 * 
 */
package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author souleymaneTHIAM
 *
 */
public class TestDates {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date dateAujr = new Date();
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String dateStr = simpleDateFormat.format(dateAujr); 
		System.out.println(dateStr);
		
		SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String dateStr1 = simpleDateFormat1.format(dateAujr); 
		System.out.println(dateStr1);
		
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	    LocalDateTime now = LocalDateTime.now();
	    System.out.println(dtf.format(now));//2016/11/16 12:08:43

	}

}
