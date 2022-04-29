package character;
import game.Play;
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
		Play play = new Play(b,quest,h);
		Trader p = new Trader("emma" ,c2, clue); 

		MadCharacter f = new MadCharacter("amadou",c1,clue);
		
		play.addCharacter(p);
		play.addCharacter(f);
		
	   // h.aroundCell(p);
	    play.play();
	    

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
