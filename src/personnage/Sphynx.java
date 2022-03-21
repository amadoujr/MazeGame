package personnage;

import java.util.Scanner;

import grille.Cell;

public class Sphynx extends FixePersonnage implements Indice {
	
	private Indice indice;
	
	public Sphynx(Cell cell, String name, Indice indice) {
		super(cell, name);
		this.indice = indice;
		// TODO Auto-generated constructor stub
	}
	
	public String giveIndice() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Qui a ecrit le seigneur des anneaux: ");
		String rep = scan.nextLine();
		System.out.println();
		if (rep.equalsIgnoreCase("tolkien")) {
			this.indice.giveIndice();
		}
		
		return "mauvaise réponse!! pas d'indice pour vous ";
	}
	

}
