/**
 * 
 */
package sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @author souleymaneTHIAM
 *
 */
public class TestSetDouble {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/** instanciation et initialisation d'un HashSet de doubles */
		HashSet<Double> h = new HashSet<Double>();
		h.add(1.5);
		h.add(8.25);
		h.add(-7.32);
		h.add(13.3);
		h.add(-12.45);
		h.add(48.5);
		h.add(0.01);

		/** Affichage de tous les éléments de la collection */
		Iterator<Double> itr = h.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		/** Recherche du plus grand élément de la collection */
		double G = 0;
		for (Double valeur : h) {
			if (valeur > G)
				G = valeur;
		}
		System.out.println("Le plus grand élèment est: "+G);
		
		/**Supprimez le plus petit élément de la collection*/
		h.remove(Collections.min(h));
		System.out.println("Aprés suppressions du plus petie élément :"+h);
		
	
	}
}
