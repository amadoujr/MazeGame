package personnage;

import Object.Objets;
import grille.Cell;
<<<<<<< HEAD

public  class MovePersonnage extends Personnage implements Indice {

	public MovePersonnage(Cell cell, String name) {
		super(cell, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void use_object() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String ask(Personnage perso) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String giveIndice() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void pick_up(Objets o) {
		// TODO Auto-generated method stub
		
	}

	
=======
>>>>>>> c2b909f91b73db71b35e44116c6bcd391db5ca48

public  class MovePersonnage extends Personnage implements Indice  {

	public MovePersonnage(String name, Cell position) {
		super(name, position);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Indice ask(Personnage p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public String GiveIndice() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void pickUp(Objets o) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void useObjet(Objets o) {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
