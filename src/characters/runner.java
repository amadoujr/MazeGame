package characters;
import game.Game;
import game.Quest;
import grille.*;
import characters.*;
import objets.*;
import java.util.*;




public class runner {
	public static void main(String[] args) {
		
		
		
		Board b = new Board(5,5);

		b.generateExhaustif();
		b.Display();
		System.out.println();
		
		Cell c1 = b.getCell(0,1);
		Cell c2 = b.getCell(0,3);
		Cell c3 = b.getCell(0, 2);
		//System.out.println(c2.openCell());
		
		Quest quest = new Quest(b);
		
		Clue clue;
		
		Random random = new Random();
		float f = random.nextFloat();
		
		if (f > 0.5) {
			clue = new ClueDistance(quest);
		}
		else {
			clue = new ClueDirection(quest);

		}

		
		Heros h = new Heros("amadou",c3);
		Objets parchemin = new Parchemins("parchemin" , c1 , clue) ;
		Objets chest = new Chest("or" , c2 ) ;
		Game game = new Game(b,quest);
		game.setHeros(h);
		
		System.out.println("-----------------------");
		RandomCharacter trader = new Trader("emma",c2,clue);
		RandomCharacter fou = new MadCharacter("lika",c1,clue);
		RandomCharacter fou2 = new MadCharacter("pff",c3,clue);
		
		System.out.println("-----------------------");
		
		game.addCharacter(fou);
		game.addCharacter(trader);
		game.addCharacter(fou2);
		game.addObjets(chest);
		game.addObjets(parchemin);
			
		System.out.println("-----------------------");

		//System.out.println(h.ask(fou2));
		
				
		
		game.play();
		//h.setGoldvalue(10);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
