package personnage;
import java.util.*;

import grille.Cell;
import objets.*;


public class Heros extends MovePersonnage  {

		List<Objets> allItems;
		private int goldvalue;
		
		public Heros(String name, Cell position) {
			super(position, name);
			this.allItems = new ArrayList<>();
			this.goldvalue = 0;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub	
	}

	@Override
	public String ask(Personnage p) {
		// TODO Auto-generated method stub
		return p.giveIndice(this);
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
		if (o instanceof Coffre) {
			this.goldvalue += ((Coffre) o).getGold();
		}
		else {
			o.useObject(this);
		}
		
	}
	/**
	 * the value of all gold the hero will pick up
	 * @return goldvalue
	 */
	public int getGoldValue() {
		return this.goldvalue;
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
}
