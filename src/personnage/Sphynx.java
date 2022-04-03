package personnage;

import java.util.*;


import grille.Cell;


public class Sphynx extends FixePersonnage {
	public Sphynx(Cell cell, String name) {
		super(cell, name);
		// TODO Auto-generated constructor stub
	}
	
	public String giveIndice(Personnage p) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Qui a ecrit le seigneur des anneaux: ");
		Random rand = new Random();
		float f = rand.nextFloat();
		String rep = scan.nextLine();
		if (rep.equalsIgnoreCase("tolkien") && f >= 0.5) {
			Indice indice = new IndiceDirection();
			return "bonne réponse !!" + indice.giveIndice(p);
			
		}
		else if (rep.equalsIgnoreCase("tolkien") && f < 0.5)  {
			Indice indice = new IndiceDistance();
			return "bonne réponse !! " + indice.giveIndice(p);
		}
		else {
			return " mauvaise réponse !! ";
		}
	}
		

}