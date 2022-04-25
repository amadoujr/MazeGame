package characters;

import grille.Board;
import grille.Cell;
import objets.Objets;

	
public class MoveCharacter extends Characters  {

	public MoveCharacter(Cell cell, String name) {
		super(name, cell);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move(Board b ) {
		Cell random ;
		random = b.chooseRandomCell(position) ;
		this.setPosition(random);
		
	}

	@Override
	public String ask(Characters perso) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void pick_up(Objets o) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public String giveIndice(Characters p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void use_Items(Object o) {
		// TODO Auto-generated method stub
		
	}


	
	
	
	
}
