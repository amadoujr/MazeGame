package character;
import game.Quest;
import grille.Board;
import grille.Cell;

public abstract class RandomCharacter extends MoveCharacter {
	protected  Clue clue  ; 
	
	
	public RandomCharacter(String name, Cell position, Clue clue) {
		super(position, name);
		this.clue = clue ; 
		// TODO Auto-generated constructor stub
	}
	/**
	public void move(Board b) {
		Cell random;
		random = b.chooseRandomCell(position);
		super.setPosition(random);
	}
	*/
}
