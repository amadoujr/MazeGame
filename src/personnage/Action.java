package personnage;

import Object.Objets;

public interface Action {

	
	public void move();
	public String ask(Personnage perso);
	public void pick_up(Objets o);
	public void use_object();
	
	

	
}
