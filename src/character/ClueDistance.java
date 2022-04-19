package character;

import game.Quest;
import grille.Cell;

/**
 * 
 * @author amadouu
 */
public class ClueDistance  implements Clue{
	
	private Quest quest;

	public ClueDistance(Quest q) {		
		this.quest = q;
	}
	
	
	

	/**
	 * this methods give a distance index to the Hero
	 *@param p the character to give the clue
	 *@return distance index
	 */
	public String giveIndice(Character p) {
		return "le but se trouve à la position " + this.quest.getPosition() ;
	}

	
	
	

}
