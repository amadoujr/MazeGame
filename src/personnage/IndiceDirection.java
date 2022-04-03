package personnage;

/**
 * @author amadouu
 */
public class IndiceDirection implements Indice  {
	
	/** Constructor */
	public IndiceDirection(){}

	/**
	 * this methods give a Direction index to the Hero
	 *@param p the character to give the clue
	 *@return direction index
	 */
	public String giveIndice (Personnage p ) {
		return " tu dois prendre la direction "+ p.getPosition().toString();
	}

}