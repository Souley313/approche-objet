/**
 * 
 */
package fr.diginamic.listes;


import java.util.ArrayList;
import java.util.List;

/**
 * @author souleymaneTHIAM
 *
 */
public class TestListeString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<>();
		list.add("Nice");
		list.add("Carcassonne");
		list.add("Narbonne");
		list.add("Lyon");
		list.add("Foix");
		list.add("Pau");
		list.add("Marseille");
		list.add("Tarbes");

		/**
		 * Recherche de la ville dans cette liste qui a le plus grand nombre de lettres
		 */
		int grand = 0;
		int index = -1;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).length() > grand) {
				grand = list.get(i).length();
				index = i;
			}
		}
		System.out.println(list.get(index));

		/**
		 * le contenu de la liste de manière à mettre tous les noms de villes en
		 * majuscules
		 */
		for (int i = 0; i < list.size(); i++) {
			list.set(i, list.get(i).toUpperCase());
		}

		System.out.println(list);

		/** Supprimez de la liste les villes dont le nom commence par la lettre N */
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).startsWith("N")) {
				list.remove(i);
			}
		}
		System.out.println(list + "\n");

		ArrayList<Ville> list2 = new ArrayList<Ville>();
		list2.add(new Ville("Nice", 343000));
		list2.add(new Ville("Carcassonne", 47800));
		list2.add(new Ville("Narbonne", 53400));
		list2.add(new Ville("Lyon", 484000));
		list2.add(new Ville("Foix", 9700));
		list2.add(new Ville("Pau", 77200));
		list2.add(new Ville("Marseille", 850700));
		list2.add(new Ville("Tarbes", 40600));

		/** Recherche et affichage de la ville la plus peuplée */
		int G = 0;
		int index1 = -1;
		for (int i = 0; i <list2.size(); i++) {
			if (list2.get(i).nbreHts > G) {
				G = list2.get(i).nbreHts;
				index1 = i;
			}
		}
		System.out.println("la ville la plus peuplée: " + list2.get(index1).nom + "\n");

		/** Suppréssion de la ville la moins peuplée */
		int g = Integer.MAX_VALUE;
		int index2 = -1;
		for (int i = 0; i < list2.size(); i++) {
			if (list2.get(i).nbreHts < g) {
				g = list2.get(i).nbreHts;
				index2 = i;
			}
		}
		list2.remove(index2);
		System.out.println(list2);
		
		/**
		 * Modification des villes de plus de 100 000 habitants en mettant leur nom en
		 * majuscules
		 */
		for (int i = 0; i < list2.size(); i++) {
			if (list2.get(i).nbreHts > 100000) {
				list2.set(i, new Ville(list2.get(i).nom.toUpperCase(), list2.get(i).nbreHts));
			}
		}

		System.out.println(list2);

	}

}
