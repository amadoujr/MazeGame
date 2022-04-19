package objets;
import character.*;
import character.Character;
import grille.*;


public class Parchemins extends Objets implements Clue {
	
	private Clue clue;
	
	public Parchemins(String name, Cell position,Clue clue) {
		super(name, position); 
		this.clue = clue;
		
	}
	
	/**
	 * this methods allows us to read the content of the parchment
	 * @param p the hero
	 */

	@Override
	public void useObject(Character p) {
		System.out.println(this.giveIndice(p));
	}
	/**
	 * give a random clue between Direction index and Distance index
	 * @param p the hero
	 * @return the clue
	 */
	public String giveIndice(Character p) {
		// TODO Auto-generated method stub
			return this.clue.giveIndice(p);
		}
	


	
}
