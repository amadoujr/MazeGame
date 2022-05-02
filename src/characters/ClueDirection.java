package characters;
import game.Quest;

/**
 * @author amadouu
 */
public class ClueDirection implements Clue  {
   
	/* Attribute quest : in order to access at the position of the quest */
	
	private Quest quest;

	/**
	 * @param quest attribute of the constructor
	 */
	public ClueDirection(Quest quest) {
		this.quest = quest;
	 }
	
	/**
	 * @param p the character to give the clue (in our case the Hero )
	 */
	public String giveIndice (Characters p ) {
		int x = this.quest.getPosition().getX() - p.getPosition().getX(); 
		int y = this.quest.getPosition().getY() - p.getPosition().getY();
		String clue = "";
		if ( x == 0 && y == 0) {
			return "le but se trouve à la position"+ quest.getPosition().toString()+" et tu y es. BRAVO!! " ;   
		}
		
		if ( x > 0){
			clue+= "tu dois prendre la direction Sud ";
		}
		else {
			clue+="tu dois prendre la direction Nord ";
		}
		
		if ( y > 0) {
			clue += "Est";
		}
		else {
			clue+="Ouest";
		}
		return clue;
		
	}
}