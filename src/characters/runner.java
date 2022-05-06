package characters;
import game.Game;
import game.Quest;
import grille.*;
import characters.*;
import objets.*;
import java.util.*;




public class runner {
	public static void main(String[] args) {
		
		
		Board b = new Board(15,15);
		b.generateExhaustif();
		b.Display();
		
		System.out.println();
		
		Cell c1 = b.getCell(0,0);
		Cell c2 = b.getCell(2,2);
		Cell c3 = b.getCell(3, 3);
		
		Quest quest = new Quest(b);
		quest.setPosition();
		Clue clue;
		
		Random random = new Random();
		float f = random.nextFloat();
		
		if (f > 0.5) {
			clue = new ClueDistance(quest);
		}
		else {
			clue = new ClueDirection(quest);

		}
		

		Heros h = new Heros("amadou",c1);
		int i;
		for (i=0; i<31;i++){
		}
		
		Objets parchemin = new Parchemins("Parchemin" , c3 , clue) ;
		Objets chest = new Chest("Or" , c2 ) ;
		Game game = new Game(b,quest);
		game.setHeros(h);
		
		
		Characters trader = new Trader("marchand",c2,clue);
		Characters fou_1  = new MadCharacter("fou-1",c1,clue);
		Characters fou_2 = new MadCharacter("fou-2",c3,clue);
		Characters sphynx = new Sphynx(b.getCell(0, 0),"sphynx",clue);
		
		
		game.addCharacter(trader);
		game.addCharacter(fou_1);
		game.addCharacter(fou_2);
		game.addCharacter(sphynx);
		
		
		game.addItems(chest);
		game.addItems(parchemin);
			

		//System.out.println(h.ask(fou2));
		
				
		
		game.play();
		//h.setGoldvalue(10);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
