package fr.iutvalence.g2d.groupe8.mastermind;

public class Case {
	
	/**
	 * la couleur de la case
	 */
	private final int couleur;
	
	/**
	 * Créer une case de la couleur donnée
	 * @param couleur
	 * 			couleur voulue
	 */
	public Case(int couleur){
		this.couleur=couleur;
	}
	
	/**
	 * Obtenir la couleur de la case
	 * @return retourne la couleur de la case
	 */
	public int obtenirCase(){
		return this.couleur;
	}
	
	

}
