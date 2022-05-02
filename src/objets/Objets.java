package objets;

import characters.Characters;
import grille.*;



public abstract class Objets {
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
	
	public abstract void useObjet(Characters p) ;
		
	
	public String toString() {
		return this.getName();
	}

	

}
