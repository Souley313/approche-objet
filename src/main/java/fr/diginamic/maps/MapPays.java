/**
 * 
 */
package fr.diginamic.maps;

import java.util.HashMap;

/**
 * @author souleymaneTHIAM
 *
 */
public class MapPays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Pays> mapPays = new HashMap<String, Pays>();
		mapPays.put("USA", new Pays("USA", 332_639_000, 59_495));
		mapPays.put("France", new Pays("France", 67_064_000, 43_551));
		mapPays.put("Allemagne", new Pays("Allemagne", 83_149_300, 50_206));
		mapPays.put("Uk", new Pays("UK", 66_436_000, 43_620));
		mapPays.put("Italie", new Pays("Italie", 61_302_519, 37_970));
		mapPays.put("Japon", new Pays("Japon", 126_010_000, 42_659));
		mapPays.put("Chine", new Pays("Chine", 1_400_050_000, 16_624));
		mapPays.put("Russie", new Pays("Russie", 146_748_590, 28_712));
		mapPays.put("Inde", new Pays("Inde", 1_386_249_417, 5_174));

		Pays p = mapPays.values().iterator().next();
		for(Pays pays : mapPays.values()) {
			if(pays.getNbHabitant() < p.getNbHabitant()) {
				p = pays;
			}
		}
		mapPays.remove(p.getNom());
		System.out.println(mapPays);
	}

}
