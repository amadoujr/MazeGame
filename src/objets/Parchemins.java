package objets;
import java.util.Random;

import character.*;
import character.Character;
import grille.*;


public class Parchemins extends Objets implements Clue {
	

	public Parchemins(String name, Cell position) {
		super(name, position); 
		
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
		// TODO Auto-generated method stub
		Random rand = new Random();
		
		}
	
	}


	
}
