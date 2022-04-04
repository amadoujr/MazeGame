package objets;
import grille.Cell;
import personnage.Personnage;

/**
 * @author amadouu
 * a Chest in the maze
 */
public class Coffre extends Objets  {
	
	/** number of gold in the chest */
	private int gold;
	
	/**
	 * 
	 * @param name the name of the object in the chest
	 * @param position the position of the object
	 */
	public Coffre(String name, Cell position) {
		super(name,position);
		this.gold = 10;

	}

	
	/**
	 * 
	 * @return the value of the gold
	 */
	public int getGold() {
		return this.gold;
	}
	
	/** methods useObject not used */
	public void useObject(Personnage p) {}

	
}
