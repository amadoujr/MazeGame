package characters;
import grille.Cell;
import java.util.*;

public class MadCharacter extends RandomCharacter  {

	public MadCharacter(String name, Cell position,Clue clue) {
		super(name, position,clue);

	}

	@Override

	public String giveIndice(Characters p) {
		Random rand = new Random();
		float alea = rand.nextFloat();
		if (alea >0.5) {
			return "le but se trouve à la position : (5,5)"  ;
		}
		else {
			return this.clue.giveIndice(p);
		}
	}

	
	




}
