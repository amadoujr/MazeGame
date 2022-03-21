package Object;
import grille.*;
import personnage.Indice;



public class Parchemins extends Objets    {
	public Indice contenu ;
	
	public Parchemins(String name, Cell position , Indice contenu) {
		super(name, position);
		this.contenu = contenu ; 
		// TODO Auto-generated constructor stub
	}

	
	
	@Override
	public String giveIndice() {
		// TODO Auto-generated method stub
		return this.contenu.giveIndice() ;
	}


	
}
