package fr.diginamic.utils;
import fr.diginamic.entites.Cercle;

public class CercleFactory {
	
	//Methode de classe qui retoure un cercle
	public static Cercle creerCercle(double r) {
		return new Cercle(r);
	}

}
