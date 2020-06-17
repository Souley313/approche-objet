/**
 * 
 */
package fr.diginamic.fichier;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

/**
 * @author formation
 *
 */
public class LectureFichier {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			File file = new File("C:\\tmp\\recensement 2016.csv");
			List<String> lignes = FileUtils.readLines(file, "UTF-8");
			for (String ligne : lignes) {
				System.out.println(ligne);
			}
			System.out.println("Nombre de lignes :" + lignes.size());

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
