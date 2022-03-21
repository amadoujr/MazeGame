package personnage;
import java.util.*;

import Object.*;
import grille.Cell;

public class Heros extends MovePersonnage {
	
	List<Objets> allObjects;
	

	public Heros(Cell cell, String name) {
		super(cell, name);
		this.allObjects = new ArrayList<>();
		// TODO Auto-generated constructor stub
	}
	
	public void move() {
		// TODO Auto-generated method stub
		
	}

	public void pick_up(Objets o) {
		this.allObjects.add(o);
		
	}
	
	public List<Objets> getAllObjects() {
		return allObjects;
	}

	public void setAllObjects(List<Objets> allObjects) {
		this.allObjects = allObjects;
	}
	
	public void use_object(Objets o) {
		for( Objets obj : allObjects) {
			if(obj.equals(o)) {
				
			}
		}
	}

	public void ask( MovePersonnage perso) {
		// TODO Auto-generated method stub
		perso.giveIndice();
	}


}
