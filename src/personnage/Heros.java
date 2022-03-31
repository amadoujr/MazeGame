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
		return null;
	}

	
	
	public void useObjets(Objets o) {
		for(Objets objet : this.allObjets) {
			if(objet.equals(o)) {
				o.giveIndice(this) ;
				 
			}
			
		
		}
		
	}
	
	
	public List<Objets> getAllObjets() {
		return allObjets;
	}

	public void setAllObjets(List<Objets> allObjets) {
		this.allObjets = allObjets;
	}
}
