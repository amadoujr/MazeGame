package personnage;
import java.util.* ;

import Object.Objets;
import grille.Cell;

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
