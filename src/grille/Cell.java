package grille;
import java.util.*;


public class Cell {
	private final int x ;
	private  final int y ; 
	private Map<Direction, Boolean> walls ;
	private boolean visited ;

	/**
	 * @param x position of the Cell
	 * @param y position of the cell
	 */
	public Cell(int x ,int y) {
		this.x = x ;
		this.y = y ;
		this.visited = false;
		

		this.walls = new HashMap<>();
	    this.walls.put(Direction.EST, true);
	    this.walls.put(Direction.SUD, true);
	   
	}
	
	@Override
	public String toString() {
	
		return "("+ this.x + " " + this.y+")";
	}
	     

	public boolean isVisited() {
		return this.visited;
	}
	
	/**
	 * @param bool the boolean value to set
	 */
	public void setVisited(boolean bool) {
		this.visited = bool ;
	}
	
		
	
	
	/**
	 * remove wall between the current cell and the next cell
	 * @param current the current cell of the player
	 * @param next the next cell of the player
	 */
	public void removeWall(Cell next) {
		 int xcoord = next.getX()- this.getX();
		 int ycoord = next.getY()- this.getY();
		 
		 if (xcoord == 1 && next.getY()== this.getY() ) {
			 next.walls.put(Direction.SUD,false);
		 }
		 else if (xcoord == -1 && next.getY()== this.getY() ) {
			 this.walls.put(Direction.SUD,false);
		 }
		 
		 if( ycoord == 1 && next.getX()== this.getX()) {
			
			 next.walls.put(Direction.EST,false);
		 }
		 else if( ycoord == -1 && next.getX()== this.getX()) {
			
			 this.walls.put(Direction.EST,false);
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

	 
			
}
