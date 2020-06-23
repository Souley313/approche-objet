package fr.diginamic.maison;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

public class MaisonTest {

	private Maison maison;

	@Before
	public void init() {

		maison = new Maison();
		Piece p1 = new Chambre(9, 0);
		Piece p2 = new Cuisine(7, 0);
		Piece p3 = new SalleDeBain(7.5, 0);

		maison.ajouterPiece(p1);
		maison.ajouterPiece(p2);
		maison.ajouterPiece(p3);
	}

	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

	@Test
	public void ajoutPieceNull() {
		maison.ajouterPiece(null);
		assertEquals("Veuillez entrer une pièce valable\r\n", systemOutRule.getLog());
	}

	@Test
	public void superficiePiecNeg() {
		Piece pN = new Chambre(-9, 0);
		maison.ajouterPiece(pN);
		assertEquals("Veuillez entrer une pièce valable\r\n", systemOutRule.getLog());

	}

	@Test
	public void superficieTotMaison() {
		double supTotM = maison.superficieTot();
		Assert.assertEquals(23.5, supTotM,  0.0001);
	}
	
	@Test
	public void superficieEtageMaison() {
		double supTotE = maison.superficieEtage(0);
		Assert.assertEquals(23.5, supTotE,  0.0001);
	}

}
