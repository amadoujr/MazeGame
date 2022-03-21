package personnage;
<<<<<<< HEAD
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

=======
import java.util.* ;

import Object.Objets;
import grille.Cell;
>>>>>>> c2b909f91b73db71b35e44116c6bcd391db5ca48

public class Heros extends MovePersonnage  {

	
		
		

		List<Objets> allObjets;
	public Heros(String name, Cell position) {
		super(name, position);
		this.allObjets = new ArrayList<>();
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Indice ask(Personnage p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void pickUp(Objets o ) {
		this.allObjets.add(o) ;
		
	}
	
	public void useObjets(Objets o) {
		for(Objets objet : this.allObjets) {
			if(objet.equals(o)) {
				o.GiveIndice() ;
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
