package characters;
import game.Quest;
import grille.*;

import objets.*;
import java.util.*;



public class runner {
	public static void main(String[] args) {
		Board b = new Board(6,6);
		Cell t = b.getCell(2,3) ;
		Cell x =b.getCell(1,2) ;
		Cell n =b.getCell(0,2);
		 
		
		
	    b.choice() ;
		
		System.out.println();
		
		Heros p = new Heros("emma" , n); 
		p.setGoldvalue(50);
		Characters p1;
		//System.out.println(q.getPosition());
		//System.out.println(p.ask(p1));
		//System.out.println(p.getPosition()) ; 
		Quest quest = new Quest(b);
		//System.out.println(quest.getPosition());
		//quest.setPosition() ;
		//System.out.println(quest.getPosition());
	//	System.out.println(quest.quest(p));
		
		
		Clue clue = new ClueDistance(quest);
	  Clue dist = new ClueDirection(quest);
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
		
		Characters p2 = new Trader("xx", t, clue) ;
		//System.out.println(p2.getPosition()) ;
		//p2.move(b);
		//System.out.println(p2.getPosition()) ;
		//System.out.println(p.ask(p2)) ;
		
		p.move(b);
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
