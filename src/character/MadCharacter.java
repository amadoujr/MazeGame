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

	/*public void move() {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int xposition = rand.nextInt();
		int yposition = rand.nextInt();
	}
*/

	public void move(Cell c ) {
		
	}



}
