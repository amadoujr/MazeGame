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
=======

import grille.*;
import personnage.Indice;

public abstract class Objets implements Indice  {
	public String name ; 
	public Cell position ; 
	
	public Objets( String name , Cell position) {
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
