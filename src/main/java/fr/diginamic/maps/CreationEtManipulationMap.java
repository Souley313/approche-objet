/**
 * 
 */
package fr.diginamic.maps;

import java.util.HashMap;

/**
 * @author souleymaneTHIAM
 *
 */
public class CreationEtManipulationMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");
		
		System.out.println("Affichage des clé: ");
		for(Integer key : mapVilles.keySet()) {
		    //Object value = mapSalaires.get(key);
		    System.out.println(key);
		}
		
		System.out.println("\nAffichage des valeurs: ");
		for(Integer key : mapVilles.keySet()) {
		    String value = mapVilles.get(key);
		    System.out.println(value);
		}
		
		System.out.println("La taille de ma map: "+mapVilles.size());

	}

}
