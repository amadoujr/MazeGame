package character;
import java.util.*;
import grille.Board;
import grille.Cell;
import objets.*;


public class Heros extends MoveCharacter  {

		List<Objets> allItems;
		private int goldvalue = 0;
		

		public Heros(String name, Cell position) {
			super(position, name);
			this.allItems = new ArrayList<>();
			
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move(Cell position ) {
		// TODO Auto-generated method stub	
		this.setPosition(position);
	}


	public int getGoldValue() {
		return goldvalue;
	}
	
	public void setGoldvalue(int goldvalue) {
		this.goldvalue = goldvalue ;
	}

	
	 public String ask(Character c) {
		 return c.giveIndice(this);
	 }
	
	
	@Override
	public void pick_up(Objets o) {
		// TODO Auto-generated method stub
		this.allItems.add(o);
	}
	/**
	 * allows the hero to use an item
	 * @param o a random object
	 */
	public void use_Items(Objets o) {
		if (o instanceof Chest) {
			this.goldvalue += ((Chest) o).getGold();
			
		}
		else {
			o.useObject(this);
		}
		
	}
	
	/**
	 * get the items
	 * @return allObjects of the hero
	 */
	
	public List<Objets> getAllItems() {
		return allItems;
	}
	/**
	 * set the items
	 * @param allObjets allObjet
	 */
	public void setAllItems(List<Objets> items) {
		this.allItems = items ;
	}
	
	
	public String aroundCell(Character c) {
		String res = "";
		if (this.position.equals(c.position)) {
			res += "ici se trouve : le " + c.toString();
		}
		else {
			res+= "ici se trouve : joueur avec "+ this.goldvalue+ " or";
		}
		
		return res;
	}
	
	
	
	
	
	
}
