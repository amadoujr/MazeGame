
package grille;
import java.util.*;


public class Cell {
	private final  int x ;
	private final int y ;
	private Map<Direction, Boolean> walls ;
	private boolean visited;

	/**
	 
	 * @param x position of the Cell
	 * @param y position of the cell
	 */
	public Cell(int x ,int y) {
		this.x = x ;
		this.y = y ;
		this.visited = false;
		this.walls = new HashMap<>();
	    this.walls.put(Direction.EAST, true);
	    this.walls.put(Direction.SOUTH, true);
	    this.walls.put(Direction.WEST, true);
	    this.walls.put(Direction.NORTH, true);
	   
	}
	
	@Override
	public String toString() {
	return "(" + this.x + " " + this.y+ ")" ;

	}
		
	

	/**
	 * @return a boolean value
	 */
	public boolean isVisited() {
		return this.visited;
	}
	
	/**
	 * @param bool the boolean value to set
	 */
	public void setVisited(boolean bool) {
		this.visited = bool;
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
			 next.walls.put(Direction.SOUTH,false);
			 this.walls.put(Direction.NORTH,false);
			 
		 }
		 else if (xcoord == -1 && next.getY()== this.getY() ) {
			 this.walls.put(Direction.SOUTH,false);
			 next.walls.put(Direction.NORTH, false);
		 }
		 
		 if( ycoord == 1 && next.getX()== this.getX()) {
			
			 this.walls.put(Direction.WEST,false);
			 next.walls.put(Direction.EAST,false);

		 }
		 else if( ycoord == -1 && next.getX()== this.getX()) {
			
			 next.walls.put(Direction.WEST,false);
			 this.walls.put(Direction.EAST,false);
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
	public boolean getWall(Direction key) {
	     return this.walls.get(key);
	}		
			
	/**
	 * @param key the key of the walls
	 * @param value the boolean value of the walls
	 */
	public void setWall(Direction key, boolean value) {
	     this.walls.put(key, value);
	}

	/**
	 * @return all Direction of an Cell that a wall is open 
	 */
	public List<Direction> openCell(){
		List<Direction> direction = new ArrayList<>();
		for (Direction key : this.walls.keySet()) {
			if (!this.getWall(key)) {
				direction.add(key);
			}
		}
		return direction;
	}
	
	 
	public boolean is_there_a_closed_cell() {
	     if (this.walls.get(Direction.EAST)  && this.walls.get(Direction.SOUTH) &&
	    		 this.walls.get(Direction.NORTH) && this.walls.get(Direction.WEST)) {
	    	 return true;
	     }
	     return false;
	}
}
