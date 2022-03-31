package personnage;

import grille.Cell;

public class Altruiste extends RandomPersonnage implements Indice {
	
	private Indice indice ; 
	public Altruiste(String name, Cell position,Indice indice ) {
		super(name, position);
		this.indice = indice ;
	}

	public Indice getIndice() {
		return indice;
	}

	public void setIndice(Indice indice) {

		this.indice = indice;
	}

	@Override

	public String giveIndice(Personnage p) {
		return this.indice.giveIndice(p);
		
	}

	public void move() {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public String ask(Personnage p) {
		// TODO Auto-generated method stub
		return null;
		
		
		
		
	}



}
