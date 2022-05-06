package characters;
import java.util.*;
import characters.*;
import grille.Cell;
import objets.*;


public class Heros extends MoveCharacter  {
	  /**
	   * attributes of the hero
	   * items : all items he will collect 
	   * goldvalue : golden number he will collect
	   */
		List<Objets> allItems;
		private int goldvalue = 0;
		
		/**
		 * initialize the constructor
		 * @param name : name of the hero
		 * @param position : position of the hero
		 */
		public Heros(String name, Cell position) {
			super(position, name);
			this.allItems = new ArrayList<>();
			
	}

	
	/**
	 * move the hero
	 * @param position : position that the hero will occupy
	 */
	public void move(Cell position) {
		// TODO Auto-generated method stub	
		this.setPosition(position);
	}

	/**
	 * get golden number
	 * @return golden number
	 */
	public int getGoldValue() {
		return goldvalue;
	}
	/**
	 * set the value
	 * @param goldvalue
	 */
	public void setGoldvalue(int goldvalue) {
		this.goldvalue = goldvalue ;
	}
	/**
	 * this method allows the hero to question a character
	 * who will give him a clue about the quest
	 * @param c the characters   
	 */
	 public String ask(Characters c) {
		 return c.giveIndice(this);
	 }
	
	
	/**
	 * allows the hero to pick an items
	 * @param o the items
	 */
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
			o.useObjet(this);
		}
		
	}
	
	/**
	 * get all items of the hero
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
	
	/**
	 * the methods checks if there another character at the same position
	 * as the hero and return a list containing those characters
	 * @param characters the characters
	 * @return a list containing characters
	 */
	public List<Characters> aroundCell(List<Characters> characters) {
		List<Characters> result = new ArrayList<>();
		for (Characters c : characters) {
			if (this.position.equals(c.position)) {
				result.add(c);
			}
		}
		return result;
	}
	
	/**
	 * the methods checks if there another items at the same position
	 * as the hero and return a list containing those characters
	 * @param objets items
	 * @return a list containing items
	 */
	
	public List<Objets> aroundObjets(List<Objets> objets){
		List<Objets> Objets = new ArrayList<>() ;
		for( Objets o : objets) {
			if(this.position.equals(o.position)) {
				Objets.add(o);
			}
			
		}
		return Objets ; 
	}
	
	
	
	
	
}
