package grille;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.random.*;



public class Cell {
	private final int x ;
	private  final int y ; 
	private Map<Direction, Boolean> murs ;
	private List<Cell> neigbors ; 
	private boolean isVisited = false ; 
	//private Cell currentCell ;
	 
	
	
	
	public Cell(int x ,int y) {
		this.x = x ;
		this.y = y ;
		
		this.neigbors = new ArrayList<Cell>();
		
		this.murs = new HashMap<>();
	     this.murs.put(Direction.EST, true);
	     this.murs.put(Direction.OUEST, true);
	     this.murs.put(Direction.NORD, true);
	     this.murs.put(Direction.SUD, true);
	     
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "*";
	}
	     

	public List<Cell> getNeigbor(){
		return this.neigbors ;
	}


	public void set_isVisited(boolean bool) {
		this.isVisited = bool ;
	}
	
	
	public boolean hasUnvisitedNeigbor() {
		for (Cell neigbor : this.neigbors) {
			if(!neigbor.isVisited) {
				return true ;
			}
			
		}
		return false ; 
	}
	
	
	
	public void removeWall(Cell current, Direction d, Cell next) {
		 //or( )//
		
	}
	
	//public boolean isCurrentCell() {
		//return this.isVisited = true ; 
	//}
	
	
	public int getX(){
		return this.x ;
	}
	
	public int getY() {
	
		return this.y ;
	}	
		

	  public boolean get_Wall(Direction key) {
	        return this.murs.get(key);
	    }		
			
	  public void set_Wall(Direction key, boolean value) {
	        this.murs.put(key, value);
	    }

	  public boolean is_there_a_closed_cell() {
	        if (this.murs.get(Direction.EST) && this.murs.get(Direction.OUEST) && this.murs.get(Direction.NORD) && this.murs.get(Direction.SUD)) {
	            return true;
	        }
	        return false;
	    }	
			
}
