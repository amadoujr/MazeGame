package character;

import game.Quest;
import grille.Cell;

/**
 * 
 * @author amadouu
 */
public class ClueDistance extends Quest implements Clue{


	private static Cell cell;
	
	public ClueDistance(Cell position) {
		super(position) ;
		
	}

	/** Empty Constructor */	
	public ClueDistance() {
		super(cell) ;
	}

	/**
	 * this methods give a distance index to the Hero
	 *@param p the character to give the clue
	 *@return distance index
	 */
	public String giveIndice(Character p) {
		return "le but se trouve à la position " + super.getPosition()  ;
	}

	
	
	

}
