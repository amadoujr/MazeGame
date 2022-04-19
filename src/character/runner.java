package character;
import game.Quest;
import grille.*;

import objets.*;
import java.util.*;



public class runner {
	public static void main(String[] args) {
		
		Board b = new Board(5,5);
	
		Cell c1 = b.getCell(0,0);
		Cell c2 = b.getCell(2,2);
		
		Quest q = new Quest(b);
		Clue clue = new ClueDistance(q);
		
		Heros p = new Heros("emma" , c1); 
		Character p2 = new Trader("xxx",c2,clue);
		p.setGoldvalue(10);
		System.out.println(p.ask(p2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
