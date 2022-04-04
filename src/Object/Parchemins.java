package Object;
import java.util.Random;

import grille.*;

import personnage.Indice;
import personnage.Personnage;

import personnage.*;



public class Parchemins extends Objets implements Indice {
	

	
	public Parchemins(String name, Cell position) {
		super(name, position); 
		
	}
	
	/**
	 * allows us to read the content of the parchment
	 * @param p the hero
	 */

	@Override


	public void useItems(Personnage p) {
		System.out.println(this.giveIndice(p));
	}
	/**
	 * give a random clue between Direction Indice and Distance Indice
	 * @param p the hero
	 */

	public String giveIndice(Personnage p) {
		

		
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
