package character;
import grille.Cell;
import java.util.*;

public class MadCharacter extends RandomCharacter implements Clue   {

	public MadCharacter(String name, Cell position) {
		super(name, position);

	}

	@Override

	public String giveIndice(Character p) {
		return " " ;
	}


	public void move(Cell c ) {
		
	}



}
