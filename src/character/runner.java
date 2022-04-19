package character;
import game.Quest;
import grille.*;

import objets.*;
import java.util.*;



public class runner {
	public static void main(String[] args) {
		Cell t = new Cell(2,3) ;
		Cell x = new Cell(0,2) ; 
		
		Board b = new Board(5,5);
		
		Heros p = new Heros("emma" , x); 
		Character p1;
		Quest q = new Quest(b);
		q.setPosition();
		System.out.println(q.getPosition());
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
		
		
		System.out.println(p.ask(p1));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
