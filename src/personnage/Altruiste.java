package personnage;

import grille.Cell;

public class Altruiste extends RandomPersonnage implements Indice {
<<<<<<< HEAD
	
	private Indice indice;
	
	public Altruiste(Cell cell, String name, Indice indice) {
		super(cell, name);
		// TODO Auto-generated constructor stub
=======

	
	private Indice indice ; 
	public Altruiste(String name, Cell position,Indice indice ) {
		super(name, position);
		this.indice = indice ;
	}

	public Indice getIndice() {
		return indice;
	}

	public void setIndice(Indice indice) {
>>>>>>> c2b909f91b73db71b35e44116c6bcd391db5ca48
		this.indice = indice;
	}

	@Override
<<<<<<< HEAD
	public String giveIndice() {
		return this.indice.giveIndice();
		
	}
=======
	public void move() {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public String GiveIndice() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Indice ask(Personnage p) {
		// TODO Auto-generated method stub
		return null;
		
		
		
		
	}


>>>>>>> c2b909f91b73db71b35e44116c6bcd391db5ca48

}
