/**
 * 
 */
package utils;

/**
 * @author Souleymane THIAM
 *
 */
public class TestObjetGeometrique {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cercle cercle1 = new Cercle(2);
		Rectangle rectangle1 = new Rectangle(2, 5);
		
		ObjetGeometrique [] figures = {cercle1, rectangle1};
		
		for(int i=0; i<figures.length; i++) {
			double primetre = figures[i].perimetre();
			double surface = figures[i].surface();
			System.out.println("Le périmètre de l'objet "+i+ " est: "+primetre+"m" +" et sa surface est: "+surface+"m2\n");
		}
		
	}
	
}
