package personnage;

import Object.Objets;
import grille.Cell;

<<<<<<< HEAD
public class FixePersonnage extends Personnage implements Indice {

	public FixePersonnage(Cell cell, String name) {
		super(cell, name);
=======
public class FixePersonnage extends Personnage implements Indice  {

	public FixePersonnage(String name, Cell position) {
		super(name, position);
>>>>>>> c2b909f91b73db71b35e44116c6bcd391db5ca48
		// TODO Auto-generated constructor stub
	}

	@Override
<<<<<<< HEAD
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pick_up(Objets o) {
=======
	public Indice ask(Personnage p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void move() {
>>>>>>> c2b909f91b73db71b35e44116c6bcd391db5ca48
		// TODO Auto-generated method stub
		
	}

<<<<<<< HEAD
	@Override
	public String ask(Personnage perso) {
=======
	

	@Override
	public String GiveIndice() {
>>>>>>> c2b909f91b73db71b35e44116c6bcd391db5ca48
		// TODO Auto-generated method stub
		return null;
	}

	@Override
<<<<<<< HEAD
	public void use_object() {
=======
	public void useObjet(Objets o) {
>>>>>>> c2b909f91b73db71b35e44116c6bcd391db5ca48
		// TODO Auto-generated method stub
		
	}

	@Override
<<<<<<< HEAD
	public String giveIndice() {
		// TODO Auto-generated method stub	
		return null;
=======
	public void pickUp(Objets o) {
		// TODO Auto-generated method stub
		
>>>>>>> c2b909f91b73db71b35e44116c6bcd391db5ca48
	}

}
