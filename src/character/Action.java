package character;

import grille.Cell;
import objets.Objets;

public interface Action {

	
	public void move(Cell c );
	public String ask(Character perso);
	public void pick_up(Objets o);
	public void use_Items(Object o);
	
	

	
	
	
	
	
	
	
	
}
