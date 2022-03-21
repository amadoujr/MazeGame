package personnage;
import  grille.*;

public abstract class Personnage implements Action {
	protected Cell cell;
	protected String name;
	
	
	public Personnage(Cell cell, String name) {
		this.cell = cell;
		this.name = name;
	}


	public Cell getCell() {
		return cell;
	}


	public void setCell(Cell cell) {
		this.cell = cell;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
}
