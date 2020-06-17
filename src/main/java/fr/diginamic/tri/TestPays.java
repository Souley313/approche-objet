/**
 * 
 */
package fr.diginamic.tri;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author souleymaneTHIAM
 *
 */
public class TestPays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

			ArrayList<Pays> pays = new ArrayList<Pays>();

			pays.add(new Pays("USA", 332_639_000, 59_495));
			pays.add(new Pays("France", 67_064_000, 43_551));
			pays.add(new Pays("Allemagne", 83_149_300, 50_206));
			pays.add(new Pays("UK", 66_436_000, 43_620));
			pays.add(new Pays("Italie", 60_317_000, 37_970));
			pays.add(new Pays("Japon", 126_010_000, 42_659));
			pays.add(new Pays("Chine", 1_400_050_000, 16_624));
			pays.add(new Pays("Russie", 146_748_590, 28_712));
			pays.add(new Pays("Inde", 1_368_163_000, 5_174));

			System.out.println(pays);
			
			// Tri des pays selon la méthode compareTo de Livre
			Collections.sort(pays);
			System.out.println(pays);
			
			
			
			

		

	}

}
