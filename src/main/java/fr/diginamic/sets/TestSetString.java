/**
 * 
 */
package fr.diginamic.sets;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author souleymaneTHIAM
 *
 */
public class TestSetString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/** instanciation et initialisation d'un HashSet de String */
		HashSet<String> h = new HashSet<>();
		h.add("USA");
		h.add("France");
		h.add("Allemagne");
		h.add("UK");
		h.add("Italie");
		h.add("Japon");
		h.add("Chine");
		h.add("Russie");
		h.add("Inde");
		
		System.out.println(h + "\n");

		/** Recherchez le pays qui a le plus grand nombre de lettres */
		String G = "";
		Iterator<String> strPays = h.iterator();
		while (strPays.hasNext()) {
			if (strPays.next().length() > G.length()) {
				G = strPays.next();
			}
		}
		h.remove(G);
		System.out.println(h + "\n");
	}
}
