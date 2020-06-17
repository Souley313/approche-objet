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
public class Pays {

	private String nom;
	private int nbrHbts;
	private int pibHbts;

	/**
	 * @param nom
	 * @param nbrHbts
	 * @param pibHbts
	 */
	public Pays(String nom, int nbrHbts, int pibHbts) {
		this.nom = nom;
		this.nbrHbts = nbrHbts;
		this.pibHbts = pibHbts;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the nbrHbts
	 */
	public double getNbrHbts() {
		return nbrHbts;
	}

	/**
	 * @param nbrHbts the nbrHbts to set
	 */
	public void setNbrHbts(int nbrHbts) {
		this.nbrHbts = nbrHbts;
	}

	/**
	 * @return the pib
	 */
	public double getPibHbts() {
		return pibHbts;
	}

	/**
	 * @param pib the pib to set
	 */
	public void setPibHbts(int pibHbts) {
		this.pibHbts = pibHbts;
	}

	@Override
	public String toString() {
		return "nom=" + nom + ", nbrHbts=" + nbrHbts + ", pibHbts=" + pibHbts;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Pays> pays = new HashSet<Pays>();
		pays.add(new Pays("USA",328239523, 62606));
		pays.add(new Pays("France", 67028048, 41470));
		pays.add(new Pays("Allemagne", 82801531, 50206));
		pays.add(new Pays("UK", 63421628, 43620));
		pays.add(new Pays("Italie", 61302519, 37970));
		pays.add(new Pays("Japon", 124856424, 42659));
		pays.add(new Pays("Chine", 1408089559, 16624));
		pays.add(new Pays("Russie", 126434660, 27900));
		pays.add(new Pays("Inde", 1386249417, 5174));

		/** Recherche du pays avec le PIB/habitant le plus important */
		double G = 0;
		Pays tmp = null;
		Iterator<Pays> p = pays.iterator();
		while (p.hasNext()) {
			Pays p1 = p.next();
			if (p1.getPibHbts() > G) {
				G = p1.getPibHbts();
				tmp = p1;
			}
		}
		System.out.println("Le pays avec le PIB/habitant le plus important est: " + tmp.nom + "\n");

		/** Recherche du pays avec le PIB total le plus important */
		double G1 = 0;
		Pays tmp1 = null;
		Iterator<Pays> p1 = pays.iterator();
		while (p1.hasNext()) {
			Pays p2 = p1.next();
			if (p2.nbrHbts * p2.pibHbts > G1) {
				G1 = p2.getPibHbts();
				tmp1 = p2;
			}
		}
		System.out.println("Le pays avec le PIB total le plus important est: " + tmp1.nom + "\n");

		/**
		 * Mettre en majuscule le pays qui a le PIB total le plus petit
		 */
		double G2 = 0;
		String tmp2 = null;
		Iterator<Pays> it = pays.iterator();
		while (it.hasNext()) {
			 //it.next();
			if (it.next().nbrHbts * it.next().pibHbts < G2) {
				tmp2 = it.next().nom.toUpperCase();
			}
		}
		System.out.println("le pays qui a le PIB total le plus petit est: "+tmp2+"\n");

		/** Supprimez le pays dont le PIB total est le plus petit */
		double G3 = 0;
		Pays tmp3 = null;
		Iterator<Pays> it1 = pays.iterator();
		while (it1.hasNext()) {
			if (it1.next().nbrHbts * it1.next().pibHbts < G3) {
				tmp3 = it1.next();
			}
		}
		pays.remove(tmp3);

		System.out.println("Après modification voici la liste des pays :");

		Iterator<Pays> iter=pays.iterator();
	      while(iter.hasNext())
	      {
	      	System.out.println (iter.next());
	      }
	}

}