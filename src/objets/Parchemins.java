package objets;
import java.util.Random;

import grille.*;
import personnage.*;


public class Parchemins extends Objets implements Indice {
	

	public Parchemins(String name, Cell position) {
		super(name, position); 
		
	}
	
	/**
	 * this methods allows us to read the content of the parchment
	 * @param p the hero
	 */

	@Override
	public void useObject(Personnage p) {
		System.out.println(this.giveIndice(p));
	}
	/**
	 * give a random clue between Direction index and Distance index
	 * @param p the hero
	 * @return the clue
	 */
	public String giveIndice(Personnage p) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Random rand = new Random();
		float f = rand.nextFloat();
		if (f >= 0.5) {
			IndiceDirection indice = new IndiceDirection();
			return indice.giveIndice(p);
		}
		else {
			IndiceDistance indice = new IndiceDistance();
			return indice.giveIndice(p);
		}
	
	}


	
}
