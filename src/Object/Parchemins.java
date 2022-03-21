package Object;
import grille.*;
import personnage.Indice;

<<<<<<< HEAD
public class Parchemins extends Objets {
	
	private Indice content;
	public Parchemins(String name, Cell cell, Indice content ) {
		super(name, cell);
		this.content = content;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String giveIndice() {
		// TODO Auto-generated method stub
		return this.content.giveIndice();
	}
		
=======
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
>>>>>>> c2b909f91b73db71b35e44116c6bcd391db5ca48

	
}
