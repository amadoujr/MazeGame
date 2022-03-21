package personnage;

import grille.Cell;

public class Position implements Indice {
	private Cell cell;
	
	public Position(Cell c) {
		super();
		this.cell = c;
	}

	@Override
	public String giveIndice() {
		// TODO Auto-generated method stub
		System.out.println("la quête est à la position: " + cell.toString()) ;
		return null;
	}
	
}
