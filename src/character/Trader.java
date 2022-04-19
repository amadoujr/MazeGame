package character;
import grille.Board;
import grille.Cell;


public class Trader extends RandomCharacter  {
	/*items of the trader */
	private int goods;
	/* price of a clue */
	private final int price;
	
	public Trader(String name, Cell position, Clue clue) {
		super(name, position, clue);
		this.price = 5;
		this.goods = 0;


		// TODO Auto-generated constructor stub
	}
	
	public String giveIndice(Character p) {
		//Scanner scan = new Scanner(System.in);
	
		System.out.println("j'échange un indice contre: "+ price+" piéces d'or");
		  if(p instanceof Heros && ((Heros) p).getGoldValue() >=5) {
			int v = ((Heros) p).getGoldValue();
			v-=5 ;
			((Heros) p).setGoldvalue(v);
			this.goods +=5 ;
			return super.clue.giveIndice(p);
			
			}
		else {
			return "tu n'as pas assez de piéces" ;
			
		}
	}
	
}
