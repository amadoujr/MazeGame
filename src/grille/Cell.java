package grille;

import java.util.*;






public class Cell {
	private final int x ;
	private  final int y ; 
	private Map<Direction, Boolean> walls ;
	private List<Cell> neigbours ; 
	private boolean isVisited = false ; 
	
	 
	
	
	
	/**
	 * @param x position of the Cell
	 * @param y position of the cell
	 */
	public Cell(int x ,int y) {
		this.x = x ;
		this.y = y ;
		
		this.neigbours = new ArrayList<Cell>();
		

		this.walls = new HashMap<>();
	     this.walls.put(Direction.EST, true);
	     this.walls.put(Direction.SUD, true);
	   
	}
	
	@Override
	public String toString() {
	
		return "*";
	}
	     

	/**
	 * @return list of neighbours in the Board
	 */
	public List<Cell> getNeigbour(){
		return this.neigbours ;
	}


	
	
	/**
	 * @param bool the boolean value to set
	 */
	public void set_isVisited(boolean bool) {
		this.isVisited = bool ;
	}
	
	
	/**
	 * check if the cell which were we are had an
	 * unvisited neighbours
	 * @return true if  it's the case of false if not
	 */
	public boolean hasUnvisitedNeigbor() {
		for (Cell neigbour : this.neigbours) {
			if(!neigbour.isVisited) {
				return true ;
			}
			
		}
		return false ; 
	}
	
	
	
	/**
	 * remove wall between the current cell and the next cell
	 * @param current the current cell of the player
	 * @param next the next cell of the player
	 */
	public void removeWall(Cell next) {
		 int xcoord = next.getX()- this.getX();
		 int ycoord = next.getY()- this.getY();
		 
		 if (xcoord == 1) {
		
			 next.walls.put(Direction.EST,false);
		 }
		 else if (ycoord == -1) {
			
			 next.walls.put(Direction.EST,false);
		 }
		 
		 if( ycoord == 1) {
			
			 next.walls.put(Direction.SUD,false);
		 }
		 else if( ycoord == -1) {
			
			 next.walls.put(Direction.SUD,false);
		 }
	}
	
	
	
	/**
	 * @return x position
	 */
	public int getX(){
		return this.x ;
	}
	
	/**
	 * @return y position
	 */
	public int getY() {
	
		return this.y ;
	}	
		

	/**
	 * @param key of the HashMap which is a direction
	 * @return a boolean value of the key 
	 */
	public boolean get_Wall(Direction key) {
	     return this.walls.get(key);
	}		
			
	/**
	 * @param key the key of the walls
	 * @param value the boolean value of the walls
	 */
	public void set_Wall(Direction key, boolean value) {
	     this.walls.put(key, value);
	}

	/**
	 * check if is there a closed cell  
	 * @return true if it's the case or false if not */
	 
	public boolean is_there_a_closed_cell() {
	     if (this.walls.get(Direction.EST)  && this.walls.get(Direction.SUD)) {
	    	 return true;
	     }
	     return false;
	}	
			
}
