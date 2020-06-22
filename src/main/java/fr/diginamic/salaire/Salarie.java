/**
 * 
 */
package fr.diginamic.salaire;

/**
 * @author Souleymane THIAM
 *
 */
public class Salarie extends Intervenant {
	
	/**Salaire*/
	private double montantSalaire;
	/**type de contrat d'un salarié*/
	private String typeContrat;

	/**Constructeur pour un salarié*/
	public Salarie(String nom, String prenom ) {
		super(nom, prenom);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @return the montantSalaire
	 */
	public double getMontantSalaire() {
		return montantSalaire;
	}


	/**
	 * @param montantSalaire the montantSalaire to set
	 */
	public void setMontantSalaire(double montantSalaire) {
		this.montantSalaire = montantSalaire;
	}


	/**
	 * @return the typeContrat
	 */
	public String getTypeContrat() {
		return typeContrat;
	}


	/**
	 * @param typeContrat the typeContrat to set
	 */
	public void setTypeContrat(String typeContrat) {
		this.typeContrat = typeContrat;
	}


	@Override
	public double getSalaire() {
		// TODO Auto-generated method stub
		return montantSalaire;
	}

	@Override
	public void afficherDonnees() {
		// TODO Auto-generated method stub
		System.out.println("Les données du salarié:\nNom: "+getNom()+"\nPrénom: "+ getPrenom()+ "\nSalaire: "+getSalaire()+ "\nStatut: "+getTypeContrat());		
	}

}
