package characters;
import game.Quest;
import grille.Board;
import grille.Cell;


/**
* class to represent Randomcharacters
* a character has a name and a given position
*/
public abstract class RandomCharacter extends MoveCharacter {
	
	protected  Clue clue  ; 
	
	
	public RandomCharacter(String name, Cell position, Clue clue) {
		super(position, name);
		this.clue = clue ; 
		// TODO Auto-generated constructor stub
	}
	/**
	 * set the player cell after a move
	 * @param position 
	 */
	public void move(Cell position) {
		this.setPosition(position);
		

	}
	

}
