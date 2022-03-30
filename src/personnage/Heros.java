package personnage;
import java.util.*;
import Object.*;
import grille.Cell;


public class Heros extends MovePersonnage  {

		List<Objets> allObjets;
		
		public Heros(String name, Cell position) {
			super(position, name);
			this.allObjets = new ArrayList<>();
		
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
		this.allObjets.add(o);
	}
	/**
	 * allows the hero to use an item
	 * @param o
	 */
	public void use_Items(Objets o) {
		o.useItems(this);
	}
	
	public List<Objets> getAllObjets() {
		return allObjets;
	}

	public void setAllObjets(List<Objets> allObjets) {
		this.allObjets = allObjets;
	}
}
