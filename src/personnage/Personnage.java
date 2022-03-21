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
	
	
=======
import grille.* ;


public abstract class Personnage implements Action  {
	protected String name ; 
	protected Cell position ;
	
	public Personnage(String name , Cell position) {
		this.name = name ; 
		this.position = position ;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Cell getPosition() {
		return position;
	}
	public void setPosition(Cell position) {
		this.position = position;
	}

	
	
	
}
