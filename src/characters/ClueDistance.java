package characters;

import game.Quest;

/**
 * ClueDistance class
 */
public class ClueDistance  implements Clue{
	/* Attribute quest : in order to access at the position of the quest */
	
	/**
	 * @param quest attribute of the constructor
	 */
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
