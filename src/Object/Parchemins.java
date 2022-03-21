package Object;
import grille.*;
import personnage.Indice;

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
		

	
}
