package personnage;
import java.util.*;
import grille.Cell;

/**
 * @author amadouu
 *
 */
public class Altruiste extends RandomPersonnage{
	
	
	
	/**
	 * @param name of the character (Altruist)
	 * @param position the position of the altruist in the Game
	 */
	public Altruiste(String name, Cell position ) {
		super(name, position);
		
	}

	
	/**
	 * this methods allows the altruist to give a hint to the Hero
	 * @param p the character to give the clue
	 * @return the chosen clue 
	 */
	public String giveIndice(Personnage p) {
		Random rand = new Random();
		float f = rand.nextFloat();
		if ( f >=0.5) {
			Indice indice = new IndiceDirection();
			return indice.giveIndice(p);
			
		}
		else {
			Indice indice = new IndiceDistance();
			return indice.giveIndice(p);
		}
	}




}
