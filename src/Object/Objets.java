package Object;
import grille.*;
import personnage.Indice;

public abstract class Objets implements Indice {
	
	protected String name;
	protected Cell Cell;
	
	public Objets(String name, grille.Cell cell) {
		this.name = name;
		Cell = cell;
	}
	
	public String toString() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
