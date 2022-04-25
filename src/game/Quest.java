package game;

import grille.Board;
import grille.Cell;
import java.util.*;
import characters.*;

public class Quest {
	
	private Board board;
	private Cell position;
	public final int goldvalue;
	
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
		return this.position;
	}
	
	public boolean getQuest(Characters c) {
		if(c instanceof Heros && ((Heros) c).getGoldValue() == goldvalue && ((Heros)c).getPosition().equals(this.getPosition())) {
			return true;
		}
		else {
			return false;
		}
	}
}
