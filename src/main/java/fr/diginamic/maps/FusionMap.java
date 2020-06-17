/**
 * 
 */
package fr.diginamic.maps;

import java.util.HashMap;
import java.util.Map;

/**
 * @author souleymaneTHIAM
 *
 */
public class FusionMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Création map1
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Rouge");
		map1.put(2, "Vert");
		map1.put(3, "Orange");
		// Création map2
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(4, "Blanc");
		map2.put(5, "Bleu");
		map2.put(6, "Orange");
		
		Map<Integer, String> map3 = new HashMap<>(map1);
		map3.putAll(map1);
		map3.putAll(map2);
		
		System.out.println("Affichage des clés et valeurs: ");
		for(Object key : map3.keySet()) {
		    Object value = map3.get(key);
		    System.out.println(key+"->"+value);
		}
		

	}

}
