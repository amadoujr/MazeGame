package characters;
import grille.* ;


public abstract class Characters implements Action , Clue  {
	protected String name ; 
	protected Cell position ;
	
	public Characters(String name , Cell position) {
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

	public String toString() {
		return this.getName();
	}

	
	
	
}
