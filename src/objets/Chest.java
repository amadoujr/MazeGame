package objets;
import character.Character;
import grille.Cell;

/**
 * @author amadouu
 * a Chest in the maze
 */
public class Chest extends Objets  {
	
	/** number of gold in the chest */
	private final int gold;
	
	/**
	 * 
	 * @param name the name of the object in the chest
	 * @param position the position of the object
	 */
	public Chest(String name, Cell position) {
		super(name,position);
		this.gold = 10;

	}

	
	/**
	 * 
	 * @return the value of the gold
	 */
	public int getGold() {
		System.out.println("Valeur : " + this.gold) ;
		return this.gold;
	}
	
	/** methods useObject not used */
	public void useObject(Character p) {
		
		
	}

	
}
