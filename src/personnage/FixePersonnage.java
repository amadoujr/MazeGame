package personnage;

import Object.Objets;
import grille.Cell;

public class FixePersonnage extends Personnage implements Indice  {

	public FixePersonnage(String name, Cell position) {
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
	public void useObjet(Objets o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pickUp(Objets o) {
		// TODO Auto-generated method stub
		
	}

}
