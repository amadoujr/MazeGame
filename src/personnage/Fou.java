package personnage;
import grille.Cell;
import java.util.*;

public class Fou extends RandomPersonnage implements Indice   {

	public Fou(String name, Cell position) {
		super(name, position);

	}

	@Override

	public String giveIndice(Personnage p) {
		// TODO Auto-generated method stub
		return null;
	}

	public void move() {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int xposition = rand.nextInt();
		int yposition = rand.nextInt();
	}


	



}
