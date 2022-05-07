package characters;
import grille.Cell;

/**
 * an altruistic character
 */
public class Altruiste extends RandomCharacter{

	/**
	 * @param name of the character (Altruist)
	 * @param position the position of the altruist in the Game
	 * @param clue the clue to give
	 */
	public Altruiste(String name, Cell position,Clue clue ) {
		super(name, position, clue);
		
		
	}

	/**
	 * this methods allows the altruist to give a hint to the Hero
	 * @param p the character to give the clue
	 * @return the chosen clue 
	 */
	public String giveIndice(Characters p) {
		return super.clue.giveIndice(p);
	}



}
