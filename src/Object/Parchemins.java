package Object;

import grille.Cell;
import personnage.Indice;

public class Parchemins extends Objets    {
	public Indice contenu ;
	
	public Parchemins(String name, Cell position , Indice contenu) {
		super(name, position);
		this.contenu = contenu ; 
		// TODO Auto-generated constructor stub
	}

	
	
	@Override
	public String GiveIndice() {
		// TODO Auto-generated method stub
		return this.contenu.GiveIndice() ;
	}

}
