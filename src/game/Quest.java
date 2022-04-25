package game;
import grille.*;
import java.util.*;

import characters.*;



public class Quest {
	private Cell position ; 
	private Board board ; 
	public  int goldvalue ;
	
	
	
	
	
		
		public Quest(Board board) {
			this.board = board;
			this.position = board.getCell(0,0);
			this.goldvalue = 50;
		}
		
		public void setPosition() {
			Random rand = new Random();
			int x = rand.nextInt(this.board.getrows());
			int y = rand.nextInt(this.board.getcols());
			this.position = this.board.getCell(x, y);
		}
		

	
	public Cell getPosition() {
		return this.position ;
	}
	
	public boolean quest(Characters p) {
		if(p instanceof Heros) {

			if(((Heros) p).getGoldValue() == this.goldvalue && p.getPosition().equals(this.getPosition())) {
				return true ; 
			}
			
		}
		return false;
		
			
		}
	
			
		
	

}
