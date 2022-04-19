package character;
import grille.Cell;
import objets.*;
import java.util.*;

import game.Quest;

public class Trader extends RandomCharacter  {
	
	private int goods;
	private final int price;
	private Clue index;
	public Trader(String name, Cell position, Clue i) {
		super(name, position);
		this.price = 5;
		this.goods = 0;
		this.index = i;
		

		// TODO Auto-generated constructor stub
	}
	
	public String giveIndice(Character p) {
		//Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		float f = rand.nextFloat();
		System.out.println("j'échange un indice contre: "+ price+" piéces d'or");
		  if(p instanceof Heros && ((Heros) p).getGoldValue() >=5) {
			int v = ((Heros) p).getGoldValue();
			v-=5 ;
			((Heros) p).setGoldvalue(v);
			this.goods +=5 ;
			return this.index.giveIndice(p);
			
			}
		else {
			return "Je ne te donne pas d'indice" ;
			
		}
	}

	
	public void move(Cell c ) {
		
	}
}
