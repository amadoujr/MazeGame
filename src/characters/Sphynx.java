package characters;
import java.util.*;
import grille.Cell;



	

public class Sphynx extends FixeCharacter {
	/**
	 * @param name of the character (sphynx)
	 * @param position the position of the sphynx in the Game
	 * @param i the clue to give
	 */	
	private Clue indice;
	public Sphynx(Cell cell, String name, Clue i) {
		super(cell, name);
		this.indice = i;


 
		
	}

	/**
	 * this methods allows the sphynx to give a hint to the Hero
	 * @param p the character to give the clue
	 * @return the chosen clue 
	 */
	public String giveIndice(Characters p) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Qui a ecrit le seigneur des anneaux: ");
		String rep = scan.nextLine();
		if (rep.equalsIgnoreCase("tolkien")) {
			//Clue indice = new ClueDirection();
			return this.indice.giveIndice(p);
		}
		
		else {
			return " mauvaise réponse !! ";
		}
	
	
	}
}