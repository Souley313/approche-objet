/**
 * 
 */
package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author souleymaneTHIAM
 *
 */
public class TestListeInt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**initialiser une liste puis y ajouter les éléments un par un avec la méthode add().*/
		List<Integer> list = new ArrayList<Integer>();
		list.add(-1);
		list.add(5);
		list.add(7);
		list.add(3);
		list.add(-2);
		list.add(4);
		list.add(8);
		list.add(5);
		
		/**affichhage de la liste*/
		System.out.println(list);
		
		/**Taille du liste*/
		System.out.println("la taille du liste "+list.size());
		
		/**Recherche du plus grand élément*/	
		int max = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > max) {
				max = list.get(i);
			}
		}
		System.out.println("le max est: " + max+ "\n");
		
		
		/**Suppréssion du plus petit élèment*/		
		list.remove(Collections.min(list));
		System.out.println("Aprés supprésions du plus petie élément :"+list);
		
		/**Recherchez tous les éléments négatifs et modifiez les de manière à ce qu’ils deviennent
positifs.*/
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) < 0) {
				list.set(i, Math.abs(list.get(i)));
			}
		}
		System.out.println("les élèments de la listes tous positifs "+list);
	}

}
