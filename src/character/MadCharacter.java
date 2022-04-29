package character;
import grille.Cell;
import java.util.*;

public class MadCharacter extends RandomCharacter {

	public MadCharacter(String name, Cell position, Clue clue) {
		super(name, position, clue);

	}

	@Override

	public String giveIndice(Character p) {
		
		return "le but se trouve à la position (5,5) ";
		
	}




}
