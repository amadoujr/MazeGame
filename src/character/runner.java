package character;
import game.Quest;
import grille.*;

import objets.*;


public class runner {
	public static void main(String[] args) {
		Cell t = new Cell(2,3) ;
		Cell x = new Cell(0,2) ; 
		Board b = new Board(5,5);
		Heros p = new Heros("emma" , x); 
		Character p1 = new Sphynx(t, "sphnx");
		RandomCharacter p2 = new MadCharacter("xx",x) ;
		Chest c = new Chest("or" , x);
		Trader trader = new Trader("marchand" , t);
		Objets o = new Parchemins("par", t) ;
		p.use_Items(c);
		//System.out.println(p.getGoldValue()) ;
		//System.out.println(p.ask(trader));
		//trader.giveIndice(p) ;
		//System.out.println(p.getGoldValue()) ;
		
		//System.out.println(c.getGold()) ;
		
		Quest q = new Quest(x);
		System.out.println(q.quete(p)) ;
		System.out.println(p.ask(p1));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
