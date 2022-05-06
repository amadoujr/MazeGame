package characters;
import grille.Cell;
import java.util.*;



public class MadCharacter extends RandomCharacter  {
	
	/**
	 * @param name of the character ( MadCharacter)
	 * @param position the position of the  MadCharacter in the Game
	 * @param clue the clue to give
	 */	

	public MadCharacter(String name, Cell position,Clue clue) {
		super(name, position,clue);

	}

	@Override

	/**
	 * this methods allows the MadCharacter to give a hint to the Hero
	 * @param p the character to give the clue
	 * @return the chosen clue 
	 */
	
	public String giveIndice(Characters p) {
		Random rand = new Random();
		float alea = rand.nextFloat();
		if (alea >0.5) {
			return "le but se trouve à la position : (5,5)"  ;
		}
		else {
			return this.clue.giveIndice(p);
		}
	}

	
	




}
