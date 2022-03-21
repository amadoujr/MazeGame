package personnage;

import grille.Cell;

public class Direction implements Indice {
	private Cell cell;
	public Direction(Cell c) {
		super();
		this.cell = c;
	}
	@Override
	public String giveIndice() {
		// TODO Auto-generated method stub
		System.out.println("tu dois prendre la direction : ");
		return null;
	}
	
}
