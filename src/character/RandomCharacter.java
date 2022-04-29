package character;
import java.util.*;
import grille.Cell;

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
