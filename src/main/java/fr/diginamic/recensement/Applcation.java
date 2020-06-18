/**
 * 
 */
package fr.diginamic.recensement;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//import java.util.Scanner;

import org.apache.commons.io.FileUtils;

import fr.diginamic.recensement.utils.ComparPlusGrandVille;
import fr.diginamic.recensement.utils.ComparPlusPetitVille;

/**
 * @author souleymaneTHIAM
 *
 */
public class Applcation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Recensement recensement = new Recensement();

		// Scanner scanner = new Scanner(System.in);

		try {
			File file = new File("C:\\tmp\\recensement 2016.csv");
			List<String> lignes = FileUtils.readLines(file, "UTF-8");
			lignes.remove(0);
			for (String ligne : lignes) {
				// System.out.println(ligne);

				String[] morceaux = ligne.split(";");
				String codeRegion = morceaux[0];
				String nomRegion = morceaux[1];
				String codeDepartement = morceaux[2];
				String codeCommune = morceaux[5];
				String nomCommune = morceaux[6];
				String population = morceaux[7];

				// Pour la population, avant la conversion en int, il faut d’abord supprimer les
				// espaces qui se trouvent à l’intérieur.
				int populationTotale = Integer.parseInt(population.replaceAll("\\s+", ""));

				// On cree maintenant la ville avec toutes ses données utiles
				Ville ville = new Ville(codeRegion, nomRegion, codeDepartement, codeCommune, nomCommune,
						populationTotale);

				recensement.getVilles().add(ville);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		/**
		 * Recherchez dans la liste la ville de Montpellier et affichez toutes les
		 * informations la concernant
		 */
		// System.out.println("Veuillez entrer un nom de ville pour afficher toutes les
		// information la concernant.");
		// String ville = scanner.next();
		for (int i = 0; i < recensement.getVilles().size(); i++) {
			if (recensement.getVilles().get(i).getNomCommune().equals("Montpellier")) {
				System.out.println(recensement.getVilles().get(i));
			}
		}

		System.out.println("-------------------\n");

		/**
		 * Afficher la population de tout le département de l’Hérault.
		 */

		// System.out.println("\nVeuillez entrer un numéro de département pour afficher
		// sa population totale.");
		// String dep = scanner.next();
		int nbrD = 0;
		for (int i = 0; i < recensement.getVilles().size(); i++) {
			if (recensement.getVilles().get(i).getCodeDepartement().equals("34")) {
				nbrD += recensement.getVilles().get(i).getPopulation();
			}
		}
		System.out.println("Le département de l’Hérault a " + nbrD + " habts\n");

		System.out.println("-------------------\n");

		/** Affichez la plus petite ville du département */

		// System.out.println("\nVeuillez entrer un numéro de dépatement pour trouver sa
		// plus petite ville.");
		// String dept = scanner.next();
		int poppV = Integer.MAX_VALUE;
		String villep = null;
		for (int i = 0; i < recensement.getVilles().size(); i++) {
			if (recensement.getVilles().get(i).getCodeDepartement().equals("34")
					&& recensement.getVilles().get(i).getPopulation() < poppV) {
				villep = recensement.getVilles().get(i).getNomCommune();
				poppV = recensement.getVilles().get(i).getPopulation();
			}
		}
		System.out.println(
				"La plus petite ville du département de l’Hérault est: " + villep + " avec " + poppV + " habts\n");

		System.out.println("-------------------\n");

		/** Affichez les 10 plus grandes villes du département */

		// System.out.println("Veuillez entrer un numéro de dépatement pour chercher les
		// 10 plus grandes et 10 plus petites villes du département.\n");
		// String deptv = scanner.next();
		
		// Alimentation d'une liste ne contenant que les villes du département donné
		List<Ville> vDept = new ArrayList<>();
		for (int i = 0; i < recensement.getVilles().size(); i++) {
			if (recensement.getVilles().get(i).getCodeDepartement().equals("34")) {
				vDept.add(recensement.getVilles().get(i));
			}
		}
		System.out.println("les 10 plus grandes villes du département de l’Hérault sont:\n");
		Collections.sort(vDept, new ComparPlusGrandVille());
		for (int i = 0; i < 10; i++) {
			System.out.println(vDept.get(i));
		}

		System.out.println("-------------------\n");

		/** Affichez les 10 plus petites villes du département */
		// List<Ville> vDept = new ArrayList<>();

		for (int i = 0; i < recensement.getVilles().size(); i++) {
			if (recensement.getVilles().get(i).getCodeDepartement().equals("34")) {
				vDept.add(recensement.getVilles().get(i));
			}
		}
		System.out.println("les 10 plus petites villes du département de l’Hérault sont: ");
		Collections.sort(vDept, new ComparPlusPetitVille());
		for (int i = 0; i < 10; i++) {
			System.out.println(vDept.get(i));
		}

		System.out.println("-------------------\n");

		/** Affichez la population de toute la région Occitaine */
		// System.out.println("Veuillez entrer un code région pour touver sa population
		// totale.");
		// String reg1 = scanner.next();
		int popReg = 0;
		for (int i = 0; i < recensement.getVilles().size(); i++) {
			if (recensement.getVilles().get(i).getNomRegion().equals("Occitanie")) {
				popReg += recensement.getVilles().get(i).getPopulation();
			}
		}
		System.out.println("La population de la région de la région d'Occitanie est : " + popReg + " habts\n");

		System.out.println("-------------------\n");

		/** Affichez les 10 villes les plus importantes de la région Occitanie */
		// Charger une liste que pour les villes de la région Occitanie
		List<Ville> vReg = new ArrayList<>();
		for (int i = 0; i < recensement.getVilles().size(); i++) {
			if (recensement.getVilles().get(i).getCodeRegion().equals("76")) {
				vReg.add(recensement.getVilles().get(i));
			}
		}

		System.out.println("Les 10 plus grandes villes de la région Occitanie");
		Collections.sort(vReg, new ComparPlusGrandVille());
		for (int i = 0; i < 10; i++) {
			System.out.println(vReg.get(i));
		}

		System.out.println("-------------------\n");

		/** Affichez le département le plus peuplé de la région Occitanie */

	}
}