package character;
import grille.Cell;
import java.util.*;

public class MadCharacter extends RandomCharacter implements Clue   {

	public MadCharacter(String name, Cell position, Clue clue) {
		super(name, position, clue);

	}

	@Override

	public String giveIndice(Character p) {
		Random rand = new Random();
		float f = rand.nextFloat();
		if ( f>0.5) {
			return "le but se trouve à la position (5,5) ";
		}
		else {
		return super.clue.giveIndice(p);
		}
	}


	public void move(Cell c ) {
		
	}



}
