/**
 * 
 */
package fr.diginamic.tri;

import java.util.Comparator;

/**
 * @author formation
 *
 */
public class ComparatorHabitant implements Comparator<Pays>{

	@Override
	public int compare(Pays o1, Pays o2) {
		// TODO Auto-generated method stub
		return ((Integer)o1.nbHabitant).compareTo( (Integer)o2.nbHabitant);
	}



}
