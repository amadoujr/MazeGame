package personnage;

import Object.Objets;
import grille.Cell;


public class FixePersonnage extends Personnage implements Indice {

	public FixePersonnage(Cell cell, String name) {
		super(name, cell);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String ask(Personnage perso) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void pick_up(Objets o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void use_object() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String giveIndice(Personnage p) {
		// TODO Auto-generated method stub
		return null;
	}



}
