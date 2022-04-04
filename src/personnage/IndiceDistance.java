package personnage;
	
/**
 * 
 * @author amadouu
 */
public class IndiceDistance implements Indice{


	/** Empty Constructor */
	public IndiceDistance() {}

	/**
	 * this methods give a distance index to the Hero
	 *@param p the character to give the clue
	 *@return distance index
	 */
	public String giveIndice(Personnage p) {
		return "le but se trouve à la position " ;
	}
	
	

}
