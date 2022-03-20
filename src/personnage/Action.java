package personnage;

import Object.Objets;

public interface Action {

	
	public Indice ask(Personnage p) ;
	public void move() ;
	public void useObjet(Objets o);
	
	void pickUp(Objets o);
	
}
