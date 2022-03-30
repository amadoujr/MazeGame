package personnage;

public class IndiceDirection implements Indice  {
   
 public IndiceDirection() {
	 super();

 }

@Override
public String giveIndice (Personnage p ) {
	// TODO Auto-generated method stub
	return " tu dois prendre la direction "+ p.getPosition().toString();
}
}