package personnage;


import grille.Cell;

public class Marchand extends RandomPersonnage implements Indice {

	public Marchand(Cell cell, String name) {
		super(cell, name);
=======
import Object.Objets;
import grille.Cell;

public class Marchand extends RandomPersonnage implements Indice  {

	public Marchand(String name, Cell position) {
		super(name, position);

		// TODO Auto-generated constructor stub
	}

	@Override

	public String giveIndice() {
		// TODO Auto-generated method stub
		return null;

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

	@Override
	public void pickUp(Objets o) {
		// TODO Auto-generated method stub

		
	}

}
