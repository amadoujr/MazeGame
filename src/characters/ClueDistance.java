package characters;

import game.Quest;
import grille.Cell;

/**
 * 
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
	public String giveIndice(Characters p) {
		return "le but se trouve à la position " + this.quest.getPosition() ;
	}

	
	
	

}
