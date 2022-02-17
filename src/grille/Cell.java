package grille;
import java.util.*;


public class Cell {
	private final int x ;
	private  final int y ; 
	List<Cell> allunvisitedCell = new ArrayList<>();
	private Map<Direction, Boolean> walls ;
	private List<Cell> neigbours; 
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
	
		return "("+ this.x + " " + this.y+")";
	}
	     

	/**
	 * @return list of neighbors in the Board
	 */
	public List<Cell> getNeigbour(){
		//return this.neigbours ;
		return this.neigbours;
	}


	/**
	 * @param n the cell that we are searching neighbors
	 * @param heigth the height (rows) of the board
	 * @param width the  width (cols) of the board
	 */
	public void addNeigbors(Cell n ,int heigth,int width) {
	
		if (n.getX() > 0) {
			this.neigbours.add(new Cell(x-1,y));
		}
		if (n.getY() > 0) {
			this.neigbours.add(new Cell(x,y-1));
		}
		if (n.getX() < heigth-1) {
				this.neigbours.add(new Cell(x+1,y));
			}
		if (n.getY() < width-1) {
			this.neigbours.add(new Cell(x,y+1));
		}
		
		
	}
	
	/**
	 * @param bool the boolean value to set
	 */
	public void set_isVisited(boolean bool) {
		this.isVisited = bool ;
	}
	
	
	/**
	 * check if the cell which were we are had an
	 * unvisited neighbors
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
	// pas tout à fait bon
	
	public int chooseRandomCell() {
		Cell randcell = null;
		
		for (Cell neigh : this.getNeigbour()) {
			if(!neigh.isVisited) {
				allunvisitedCell.add(neigh);
			}
			
		}
		Random rand = new Random();
		int pos = (allunvisitedCell.size());
		//randcell = allunvisitedCell.get(pos);
		return pos;
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
