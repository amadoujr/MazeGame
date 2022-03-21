package personnage;




import grille.* ;


public abstract class Personnage implements Action  {
	protected String name ; 
	protected Cell position ;
	
	public Personnage(String name , Cell position) {
		this.name = name ; 
		this.position = position ;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Cell getPosition() {
		return position;
	}
	public void setPosition(Cell position) {
		this.position = position;
	}

	
	
	
}
