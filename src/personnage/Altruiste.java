package personnage;

import grille.Cell;

public class Altruiste extends RandomPersonnage implements Indice {
	
	private Indice indice;
	
	public Altruiste(Cell cell, String name, Indice indice) {
		super(cell, name);
		// TODO Auto-generated constructor stub
		this.indice = indice;
	}

	@Override
	public String giveIndice() {
		return this.indice.giveIndice();
		
	}

}
