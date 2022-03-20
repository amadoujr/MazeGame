package personnage;

import grille.Cell;

public class IndiceDirection implements Indice  {
 private Cell cell ;
   
 public IndiceDirection(Cell cell ) {
	 super();
	 this.cell = cell ; 
 }
	@Override
	public String GiveIndice() {
	 return " " ;
	}

}
