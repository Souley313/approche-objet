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
public class CreationListe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> listeInt = new ArrayList<>();
		for(int i=1; i<=100; i++){
			listeInt.add(i);				
		}
		
		System.out.println(listeInt);
		
		System.out.println("La taille de ma liste est: "+listeInt.size());
	}

}
