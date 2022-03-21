package personnage;

import java.util.Scanner;

import grille.Cell;

<<<<<<< HEAD
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
	
=======
public class Sphynx extends FixePersonnage  implements Indice  {
			private Indice indice ;	
			
			
	public Sphynx(String name, Cell position ,Indice indice ) {
		super(name, position);
		this.indice = indice ; 
		
		// TODO Auto-generated constructor stub
	}


	@Override
	public String GiveIndice() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in) ;
		System.out.println("qui a ecris le seigneur des anneaux?");
		 String rep = sc.nextLine();
		 if(rep.equalsIgnoreCase("TOLKIEN")) {
			 this.indice.GiveIndice();
		 }
		 return "mauvaise reponse";
	}
>>>>>>> c2b909f91b73db71b35e44116c6bcd391db5ca48

}
