package character;

import java.util.*;




import grille.Cell;



	

public class Sphynx extends FixeCharacter {

	public Sphynx(Cell cell, String name) {
		super(cell, name);


 
		
	}
	
	public String giveIndice(Character p) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Qui a ecrit le seigneur des anneaux: ");
		String rep = scan.nextLine();
		Random rand = new Random();
		float f = rand.nextFloat();
		if (rep.equalsIgnoreCase("tolkien") && f >= 0.5) {
			Clue indice = new ClueDirection();
			return "bonne réponse !! "+ indice.giveIndice(p);
		}
		else if (rep.equalsIgnoreCase("tolkien") && f < 0.5)  {
			Clue indice = new ClueDistance();
			return "bonne réponse !! " + indice.giveIndice(p);
		}

		
		else {
			return " mauvaise réponse !! ";
		}
	
	
	}
}