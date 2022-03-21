package personnage;

import Object.Objets;

public interface Action {
<<<<<<< HEAD
	
	public void move();
	public String ask(Personnage perso);
	public void pick_up(Objets o);
	public void use_object();
=======

	
	public Indice ask(Personnage p) ;
	public void move() ;
	public void useObjet(Objets o);
	
	void pickUp(Objets o);
>>>>>>> c2b909f91b73db71b35e44116c6bcd391db5ca48
	
}
