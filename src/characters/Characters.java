package characters;
import grille.* ;

/**
 * an abstract class to represent characters
 * a character has a name and a given position
 */
public abstract class Characters implements Action , Clue  {
	protected String name ;
	protected Cell position ;

	/**
	 * initialize constructor
	 * @param name name of the character
	 * @param position position of the character
	 */
	public Characters(String name , Cell position) {
		this.name = name ;
		this.position = position ;
	}

	/**
	 * get the name of the character
	 * @return the name of the character
	 */
	public String getName() {
		return name;
	}
	/**
	 * set the name of the character
	 * @param name name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * get the position of the character
	 * @return the position of the character
	 */
	public Cell getPosition() {
		return position;
	}
	/**
	 * set the position of the character
	 * @param position position to the set
	 */
	public void setPosition(Cell position) {
		this.position = position;
	}


	public String toString() {
		return this.getName();
	}




}
