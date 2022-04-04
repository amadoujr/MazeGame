package personnage;
import grille.*;
import objets.Coffre;
import Object.*;
import grille.*;

public class runner {
	public static void main(String[] args) {
		Cell t = new Cell(2,3) ;
		Cell x = new Cell(0,2) ; 
		Board b = new Board(5,5);
		Heros p = new Heros("emma" , x); 
		Personnage p1 = new Sphynx(t, "sphnx");
		RandomPersonnage p2 = new Fou("xx",x) ;
		Coffre c = new Coffre("or" , x);
		Objets o = new Parchemins("par", t) ;
		p.use_Items(c);
		System.out.println(p.getGoldValue()) ;
		p.use_Items(c);
		System.out.println(p.getGoldValue()) ;
		b.randomove(p2);
		System.out.println(p2.getPosition());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
