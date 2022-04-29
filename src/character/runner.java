package character;
import game.Game;
import game.Quest;
import grille.*;

import objets.*;
import java.util.*;

import javax.xml.stream.events.Characters;



public class runner {
	public static void main(String[] args) {
		
		Board b = new Board(5,5);

		b.generateExhaustif();
		b.Display();
		System.out.println();
		Cell c1 = b.getCell(0,1);
		Cell c2 = b.getCell(3,4);
		//System.out.println(c2.openCell());
		
		Quest quest = new Quest(b);
		Clue clue = new ClueDistance(quest);
		
		Heros h = new Heros("amadou",c1);
		//h.setGoldvalue(10);
		Game game = new Game(b,quest,h);
		Trader p = new Trader("emma" ,c2, clue); 

		MadCharacter f = new MadCharacter("amadou",c1,clue);
		
		game.addCharacter(p);
		game.addCharacter(f);
		
	   // h.aroundCell(p);
	    game.play();
	    

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
