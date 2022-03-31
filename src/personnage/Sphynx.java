package personnage;

import java.util.*;

import grille.Cell;


public class Sphynx extends FixePersonnage implements Indice {
	
	
	
	public Sphynx(Cell cell, String name) {
		super(cell, name);
		
		// TODO Auto-generated constructor stub
	}
	
	public String giveIndice(Personnage p) {
		Random random = new Random() ;
		Float f  = random.nextFloat() ;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Qui a ecrit le seigneur des anneaux: ");
		String rep = scan.nextLine();
		System.out.println();
		if (rep.equalsIgnoreCase("tolkien") && f>=0.5) {
			Indice indice = new IndiceDistance(p);
			indice.giveIndice(p) ;
			
			
		}
		Indice indice = new IndiceDirection() ;
		indice.giveIndice(p) ;
		
		return "mauvaise réponse!! pas d'indice pour vous ";
	}
	

}