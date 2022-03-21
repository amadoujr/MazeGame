package personnage;

<<<<<<< HEAD
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
>>>>>>> c2b909f91b73db71b35e44116c6bcd391db5ca48
		// TODO Auto-generated constructor stub
	}

	@Override
<<<<<<< HEAD
	public String giveIndice() {
		// TODO Auto-generated method stub
		return null;
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

	@Override
	public void pickUp(Objets o) {
		// TODO Auto-generated method stub
>>>>>>> c2b909f91b73db71b35e44116c6bcd391db5ca48
		
	}

}
