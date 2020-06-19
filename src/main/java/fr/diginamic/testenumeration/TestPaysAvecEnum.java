/**
 * 
 */
package fr.diginamic.testenumeration;

import java.util.HashMap;
import java.util.Map.Entry;

/**
 * @author soulemaneTHIAM
 *
 */
public class TestPaysAvecEnum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		HashMap<String, Pays> pays = new HashMap<String, Pays>();

		pays.put("USA", new Pays("USA", 332_639_000, 59_495, Continent.AMERIQUE));
		pays.put("France", new Pays("France", 67_064_000, 43_551, Continent.EUROPE));
		pays.put("Allemagne", new Pays("Allemagne", 83_149_300, 50_206, Continent.EUROPE));
		pays.put("Uk", new Pays("UK", 66_436_000, 43_620, Continent.EUROPE));
		pays.put("Italie", new Pays("Italie", 61_302_519, 37_970, Continent.EUROPE));
		pays.put("Japon", new Pays("Japon", 126_010_000, 42_659, Continent.ASIE));
		pays.put("Chine", new Pays("Chine", 1_400_050_000, 16_624, Continent.ASIE));
		pays.put("Russie", new Pays("Russie", 146_748_590, 28_712, Continent.EUROPE));
		pays.put("Inde", new Pays("Inde", 1_386_249_417, 5_174, Continent.ASIE));

		for (Entry<String, Pays> entry : pays.entrySet()) {
			System.out.println(entry.getValue());
		}
		
		System.out.println("-------------------");

		int eu = 0, am = 0, as = 0, af = 0, oc = 0;

		for (Entry<String, Pays> entry : pays.entrySet()) {
			if (entry.getValue().getNomContinent().equals(Continent.AMERIQUE)) {
				am++;

			}

			if (entry.getValue().getNomContinent().equals(Continent.EUROPE)) {
				eu++;

			}

			if (entry.getValue().getNomContinent().equals(Continent.AFRIQUE)) {
				af++;

			}

			if (entry.getValue().getNomContinent().equals(Continent.ASIE)) {
				as++;
			}
			if (entry.getValue().getNomContinent().equals(Continent.OCEANIE)) {
				oc++;

			}

		}
		System.out.println(Continent.AMERIQUE + ":" + am);
		System.out.println(Continent.EUROPE + ":" + eu);
		System.out.println(Continent.AFRIQUE + ":" + af);
		System.out.println(Continent.ASIE + ":" + as);
		System.out.println(Continent.OCEANIE + ":" + oc);

	}

}
