package Object;
import grille.Cell;
import personnage.Personnage;

/**
 * @author amadouu
 *
 */
public class Coffre extends Objets  {
	
	private int gold;

	public Coffre(String name, Cell position) {
		super(name,position);
		this.gold = 10;

	}

	
	/**
	 * @return 
	 */
	public int getGold() {
		return this.gold;
	}

	/**
	 * @param gold
	 */
	public void setGold(int gold) {
		this.gold = gold;
	}
	
	@Override
	public void useItems(Personnage p) {
		 System.out.println(this.getGold());
	}

	
}
