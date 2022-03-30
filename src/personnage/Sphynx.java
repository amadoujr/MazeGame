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
		String rep = scan.nextLine();
		System.out.println();
		Random rand = new Random();
		float f = rand.nextFloat();
		if (rep.equalsIgnoreCase("tolkien") && f >= 0.5) {
			Indice indice = new IndiceDirection();
			indice.giveIndice(p);
		}
		else {
			Indice indice = new IndiceDistance();
			indice.giveIndice(p);
		}
		return "mauvaise réponse!! pas d'indice pour vous ";
	}
	

}