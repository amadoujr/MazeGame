package personnage;


/**
 * @author amadouu
 */
public class IndiceDirection implements Indice  {
   
 public IndiceDirection() {
	 super();
 
 }


public String giveIndice (Personnage p ) {

	// TODO Auto-generated method stub
	return " tu dois prendre la direction "+ p.getPosition().toString();
}
}