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
		
		Cell c1 = b.getCell(1,0);
		Cell c2 = b.getCell(0,1);
		Cell c3 = b.getCell(0,0);
		//System.out.println(c2.openCell());
		
		Quest quest = new Quest(b);
		Clue clue = new ClueDistance(quest);

		
		Heros h = new Heros("amadou",c3);
		Objets parchemin = new Parchemins("parchemin" , c1 , clue) ;
		Objets chest = new Chest("or" , c2 ) ;
		Game game = new Game(b,quest);
		game.setHeros(h);
		RandomCharacter trader = new Trader("emma",c2,clue);
		RandomCharacter fou = new MadCharacter("lika",c1,clue);
		game.addCharacter(fou);
		game.addCharacter(trader);
		game.addObjets(chest);
		game.addObjets(parchemin);
		
		game.addpers();
		
		System.out.println(game.getPers());
		
		
		
		
				
		
		game.play();
		//h.setGoldvalue(10);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
