package personnage;

public class IndiceDistance implements Indice{
	
	public IndiceDistance(Personnage p) {
		super() ;
	}
	public String giveIndice(Personnage p) {
		return "le but se trouve à la position ";
	}

}
