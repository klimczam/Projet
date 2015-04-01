package fr.iutvalence.g2d.groupe8.mastermind;

public class Plateau {
	
	/**
	 * On initialise le nombre de lignes
	 */
	private final int NOMBRE_DE_LIGNES = 8;
	
	/**
	 * On initialise le nombre de colonnes
	 */
	private final int NOMBRE_DE_COLONNES = 4;
	
	/**
	 * 
	 */
	private Cases[][] cases;
	
	/**
	 * 
	 */
	
	public Plateau(){
	
		this.cases= new Cases[NOMBRE_DE_COLONNES][NOMBRE_DE_LIGNES];
		
		for (int i=0; i<NOMBRE_DE_COLONNES; i++ ){
			for (int j=0; j<NOMBRE_DE_LIGNES; j++){
				cases[i][j] = new  Cases(Couleurs.vide);
			}
		}
	}
	
	public static void main(String[] args){
		System.out.println(new Plateau());
	}

}
