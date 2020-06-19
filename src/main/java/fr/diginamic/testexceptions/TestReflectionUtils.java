/**
 * 
 */
package fr.diginamic.testexceptions;

import fr.diginamic.maps.Pays;

/**
 * @author souleymaneTHIAM
 *
 */
public class TestReflectionUtils {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pays pays = new Pays("France", 67_064_000, 43_551);
		
				try {
					ReflectionUtils.afficherAttributs(pays);
				} catch ( PaysNullException | IllegalArgumentException | IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println(e.getMessage());
				}
		

	}

}
