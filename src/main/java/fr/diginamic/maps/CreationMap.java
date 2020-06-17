/**
 * 
 */
package fr.diginamic.maps;

import java.util.HashMap;

/**
 * @author souleymaneTHIAM
 *
 */
public class CreationMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// La fameuse syntaxe en diamant de Java 7
		HashMap<String, Integer> mapSalaires = new HashMap<>();
		mapSalaires.put("Paul", 1750);
		mapSalaires.put("hicham", 1825);
		mapSalaires.put("Yu", 2250);
		mapSalaires.put("Ingrid", 2015);
		mapSalaires.put("Chantal", 2418);

		System.out.println("La taille de ma map: "+mapSalaires.size());
	}

}
