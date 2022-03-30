package personnage;
import Object.Objets;
import grille.Cell;
import java.util.*;

public class Marchand extends RandomPersonnage  {
	List<Objets> allObjects;
	public Marchand(String name, Cell position) {
		super(name, position);
		this.allObjects = new ArrayList<>();

		// TODO Auto-generated constructor stub
	}
	
	public String giveIndice(Personnage p) {
		return null;
	}
	
}
