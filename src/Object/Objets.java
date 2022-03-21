package Object;
<<<<<<< HEAD
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
>>>>>>> c2b909f91b73db71b35e44116c6bcd391db5ca48
	}
	public void setName(String name) {
		this.name = name;
	}
<<<<<<< HEAD
	

=======
	public Cell getPosition() {
		return position;
	}
	public void setPosition(Cell position) {
		this.position = position;
	}
	
>>>>>>> c2b909f91b73db71b35e44116c6bcd391db5ca48
}
