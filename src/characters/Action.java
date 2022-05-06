package characters;
import grille.Cell;
import objets.Objets;

public interface Action {

	
	
	public void move(Cell position);
	public String ask(Characters perso);
	public void pick_up(Objets o);
	public void use_Items(Object o);
	
	

	
	
	
	
	
	
	
	
}
