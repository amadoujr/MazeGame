package characters;
import grille.Cell;
import java.util.*;


public class Trader extends RandomCharacter  {
	
	/**
	   * attributes of the trader
	   * goods : goods number he will collect 
	   * price : the price that you must pay to recieve a clue 
	   */
	private int goods;
	private final int price;
	
	
	 
	public Trader(String name, Cell position, Clue clue) {

		/**
		 * initialize the constructor
		 * @param name : name of the trader
		 * @param position : position of the trader
		 * @param clue : the clue to give
		 */
		super(name, position,clue);
		this.price = 5;
		this.goods = 0;
		
		

		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * this methods allows the trader to give a hint to the Hero
	 * @param p the character to give the clue
	 * @return the chosen clue 
	 */
	public String giveIndice(Characters p) {
		System.out.println("j'échange un indice contre: "+ price +" piéces d'or");
		  if(p instanceof Heros && ((Heros) p).getGoldValue() >=5) {
			int v = ((Heros) p).getGoldValue();
			v-=5 ;
			((Heros) p).setGoldvalue(v);
			this.goods +=5 ;
			return super.clue.giveIndice(p);
			
			}
		else {
			return "visiblement t n'en a pas assez, Dommage!!" ;
			
		}
	}

	
	
}
