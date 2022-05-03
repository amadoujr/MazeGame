package characters;
import java.util.*;
import characters.*;
import grille.Cell;
import grille.Direction;
import objets.*;


public class Heros extends MoveCharacter  {

		List<Objets> allItems;
		private int goldvalue = 0;
		

		public Heros(String name, Cell position) {
			super(position, name);
			this.allItems = new ArrayList<>();
			
		// TODO Auto-gener ated constructor stub
	}

	
	@Override
	public void move(Cell position) {
		// TODO Auto-generated method stub	
		this.setPosition(position);
	}


	public int getGoldValue() {
		return goldvalue;
	}
	
	public void setGoldvalue(int goldvalue) {
		this.goldvalue = goldvalue ;
	}

	 public String ask(Characters c) {
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
			o.useObjet(this);
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
	
	
	public List<RandomCharacter> aroundCell(List<RandomCharacter> characters) {
		List<RandomCharacter> res = new ArrayList<>();
		for (RandomCharacter c : characters) {
			if (this.position.equals(c.position)) {
				res.add(c);
			}
		}

		/**if (this.position.equals(c.getPosition())) {
			res += "ici se trouve : le " + c.toString();
		}
		else {
			res+= "ici se trouve : joueur avec "+ this.goldvalue+ " or";
		}
		*/
		return res;
	}
	
	
	
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
