package character;
import java.util.*;
import grille.Cell;

/**
 * @author amadouu
 *
 */
public class Altruiste extends RandomCharacter{
	
	private Clue index;

	/**
	 * @param name of the character (Altruist)
	 * @param position the position of the altruist in the Game
	 * @param i the clue to give
	 */
	public Altruiste(String name, Cell position , Clue i ) {
		super(name, position);
		this.index = i;
		
	}

	
	/**
	 * this methods allows the altruist to give a hint to the Hero
	 * @param p the character to give the clue
	 * @return the chosen clue 
	 */
	public String giveIndice(Character p) {
		Random rand = new Random();
		float f = rand.nextFloat();
		return this.index.giveIndice(p);
	}

  public void move(Cell c) {
	  
  }


}
