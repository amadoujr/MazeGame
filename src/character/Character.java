package character;
import grille.* ;


public abstract class Character implements Action , Clue  {
	protected String name ; 
	protected Cell position ;
	
	public Character(String name , Cell position) {
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

	
	public void move(Board b ) {
		Cell random ;
		random = b.chooseRandomCell(position) ;
		this.setPosition(random);
		
	}
	
	
}
