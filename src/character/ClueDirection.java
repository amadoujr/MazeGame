package character;
import game.Quest;
import grille.*;

/**
 * @author amadouu
 */
public class ClueDirection extends Quest implements Clue  {
   
 private static Cell cell;

public ClueDirection(Cell position) {
	 super(position);
 
 }

 public ClueDirection() {
	 super(cell);
 }

public String giveIndice (Character p ) {

	// TODO Auto-generated method stub
	return " tu dois prendre la direction " ;
}
}