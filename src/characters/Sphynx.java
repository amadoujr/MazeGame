package characters;

import java.util.*;




import grille.Cell;



	

public class Sphynx extends FixeCharacter {
	private Clue index;
	public Sphynx(Cell cell, String name, Clue i) {
		super(cell, name);
		this.index = i;


 
		
	}
	
	public String giveIndice(Characters p) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Qui a ecrit le seigneur des anneaux: ");
		String rep = scan.nextLine();
		if (rep.equalsIgnoreCase("tolkien")) {
			//Clue indice = new ClueDirection();
			return this.index.giveIndice(p);
		}
		
		else {
			return " mauvaise réponse !! ";
		}
	
	
	}
}