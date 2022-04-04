package personnage;

import java.util.*;




import grille.Cell;



	

public class Sphynx extends FixePersonnage {

	public Sphynx(Cell cell, String name) {
		super(cell, name);


 
		
	}
	
	public String giveIndice(Personnage p) {

		Random random = new Random() ;
		Float f  = random.nextFloat() ;

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Qui a ecrit le seigneur des anneaux: ");
		String rep = scan.nextLine();
		System.out.println();
		if (rep.equalsIgnoreCase("tolkien") && f >= 0.5) {
			Indice indice = new IndiceDirection();
			return indice.giveIndice(p);

		}

		else if(rep.equalsIgnoreCase("tolkien") && f<0.5) {
			Indice indice = new IndiceDistance();
			return indice.giveIndice(p);
		}

		
		else {
			return "mauvaise réponse!! pas d'indice pour vous ";
		}
	
	
	}
}