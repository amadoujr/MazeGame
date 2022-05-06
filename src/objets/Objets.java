package objets;

import characters.Characters;
import grille.*;


/**
* an abstract class to represent objets
* a character has a name and a given position
*/
public abstract class Objets {
	public String name ; 
	public Cell position ; 
	
	/**
	 * initialize constructor 
	 * @param name name of the objet
	 * @param position position of the objet
	 */
	
	public Objets( String name , Cell position) {
		this.name = name ; 
		this.position = position ; 
	}
	

	/**
	 * get the name of the objet
	 * @return the name  of the objet
	 */
	public String getName() {
		return name;

	}
	
	/**
	 * set the name of the objet
	 * @param name name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * get the position of the objet
	 * @return the position of the objet
	 */
	public Cell getPosition() {
		return position;
	}
	
	/**
	 * set the position of the objet
	 * @param position position to set
	 */
	public void setPosition(Cell position) {
		this.position = position;
	}
	
	public abstract void useObjet(Characters p) ;
		
	
	public String toString() {
		return this.getName();
	}

	

}
