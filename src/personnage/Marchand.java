package personnage;
import grille.Cell;
import objets.*;
import java.util.*;

public class Marchand extends RandomPersonnage  {
	
	private int goods;
	private int price;
	public Marchand(String name, Cell position) {
		super(name, position);
		this.price = 5;
		this.goods = 0;
		

		// TODO Auto-generated constructor stub
	}
	
	public String giveIndice(Personnage p) {
		Scanner scan = new Scanner(System.in);
		System.out.println("j'échange un indice contre: "+ price+" piéces d'or");
		return null;
	}
}
