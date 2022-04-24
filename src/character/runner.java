package character;
import game.Quest;
import grille.*;

import objets.*;
import java.util.*;



public class runner {
	public static void main(String[] args) {
		Cell t = new Cell(2,3) ;
		Cell x = new Cell(0,2) ;
		Cell n = new Cell(0,0);
		Cell s = new Cell(6,6) ;
		
		Board b = new Board(6,6);
		//b.choice() ;
		System.out.println();
		
		Heros p = new Heros("emma" , n); 
		p.setGoldvalue(50);
		
		
		
		
		Character p1;
		Quest q = new Quest(b);
		q.setPosition();
		//System.out.println(q.getPosition());
		Clue clue = new ClueDistance(q);
		Clue dist = new ClueDirection(q);
		Random rand = new Random();
		float alea = rand.nextFloat();
		if (alea >0.5) {
			p1 = new Sphynx(t, "sphnx", clue);
		}
		else {
			p1 = new Sphynx(t, "sphnx", dist);
		}
		
		
		Chest c = new Chest("or" , x);
		Objets o = new Parchemins("par", t, dist) ;
		
		
		//System.out.println(p.ask(p1));
		
		Character p2 = new Trader("xx", t, clue) ;
		//System.out.println(p2.getPosition()) ; 
		//p2.move(b);
		
		System.out.println(p.getPosition()) ; 
		Quest quest = new Quest(b);
		System.out.println(quest.getPosition());
		System.out.println(quest.quest(p));
		
		
		
		;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
