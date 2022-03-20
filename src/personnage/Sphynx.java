package personnage;

import java.util.Scanner;

import grille.Cell;

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

}
