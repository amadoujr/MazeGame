package grille;

import java.util.*;

public class Board {
	
	private Cell[][] board ;
	private int rows ;
	private int cols ;
	private List<Cell>neighbours = new ArrayList<>();
	private Stack<Cell> stack = new Stack <>();
	
	public Board(int rows ,int cols) {
		
		this.rows = rows ;
		this.cols = cols; 
		this.board = new Cell[rows][cols];
		for(int i = 0 ; i < rows ; i++ ) {
			for(int j = 0 ; j< cols ; j++) {
				this.board[i][j] = new Cell(i,j);
				
			}
		}

		
		    
		
		
		for(int i = 0 ; i < rows ; i++ ) {
			for(int j = 0 ; j< cols ; j++) {
				this.addNeigbors(this.board[i][j]);
			}
		}
	
	
		
		
		
	}
	/**
	 * this methods assign to every cell his neighbors 
	 * @param n the cell that we are searching neighbors
	  
	 */
	public void addNeigbors(Cell n) {
	
		if (n.getX() > 0) {
			this.neighbours.add(this.board[n.getX()-1][n.getY()]);
		}
		if (n.getY() > 0) {
			this.neighbours.add(this.board[n.getX()][n.getY()-1]);
		}
		if (n.getX() < this.rows-1) {
				this.neighbours.add(this.board[n.getX()+1][n.getY()]);
			}
		if (n.getY() < this.cols-1) {
			this.neighbours.add(this.board[n.getX()][n.getY()+1]);
		}
		
	
	}
	
	/**
	 * this methods take a cell in the parameter and return the list of neighbors of this cell 
	 * @param n the cell 
	 * @return the list of neighbors of the cell n 
	 */
	public List<Cell> getNeighboursCells(Cell n){
		List<Cell> liste = new ArrayList<>();
		
		if (n.getX() > 0) {
			liste.add(this.board[n.getX()-1][n.getY()]);
		}
		if (n.getY() > 0) {
			liste.add(this.board[n.getX()][n.getY()-1]);
		}
		if (n.getX() < this.rows -1) {
				liste.add(this.board[n.getX()+1][n.getY()]);
			}
		if (n.getY() < this.cols -1) {
			liste.add(this.board[n.getX()][n.getY()+1]);
		}
		return  liste ;
	}
	

	/**
	 * check if the cell which were we are had an
	 * unvisited neighbors
	 * @return true if  it's the case of false if not
	 */
	public boolean hasUnvisitedNeigbor(Cell c) {
		for (Cell neigbour : this.getNeighboursCells(c)) {
			if(!neigbour.isVisited()) {
				return true ;
			}
		}
		return false ; 
	}

	
	public Cell chooseRandomCell(Cell n) {
		Cell randcell = null ;
		allUnvisitedNeigbours = new ArrayList<>();
		for(Cell x : this.getNeighboursCells(n)) {
			
			if(!x.isVisited()) {
				allUnvisitedNeigbours.add(x);
			}
		}
		if(allunvisitedCell.size()>0) {
			Random randcell = new Random();
			int pos = rand.nextInt(allunvisitedCell.size());
			randcell = allunvisitedCell.get(pos);
		}
		else {
			return null;
		}
		return randcell;
		
	}
	

	/**
	 * @param x the position in the cell
	 * @param y the position in the cell
	 * @return the cell at position (x,y)
	 */
	public Cell getCell(int x , int y) {
		
		return this.board[x][y];
	}
	
	public Cell [][] getBoard(){
		return this.board;
	}
	
	public int getrows() {
		return this.rows;
	}
	
	public int getcols() {
		return this.cols;
	}
	
	
	
	 /**
	 * it's generate the maze 
	 */
	public void generateMaze() {
		int visite = 1 ;
		int totalcell = this.rows*this.cols;
		// set currentcell as the first cell
		Cell currentCell = this.board[0][0];
		// set the currentcell as visited
		currentCell.setVisited(true);
		while(visite < totalcell) {
			if(this.hasUnvisitedNeigbor(currentCell)) {
				Cell next = this.chooseRandomCell(currentCell);
				currentCell.removeWall(next);
				stack.add(currentCell);
				currentCell = next ;
				
			    currentCell.setVisited(true) ;
			   visite+=1 ;  
			}
			else if (!this.stackCell.empty()) {
					currentCell = this.stackCell.pop();
				}
			else {
				System.out.println("FINISHED");
			}
		}
		
	}

	
	
	
	
	/**
	 * display the board
	 */
	public void Display() {
		for(int i = 0 ; i<rows ; i++) {
			System.out.println() ;
			for(int j = 0 ; j< cols ;j++) {
				if(this.board[i][j].getWall(Direction.SUD)) {
					System.out.print("+---");
				}
				else {
					System.out.print("+   ");
				}
			}
			System.out.println("+");
			for (int j = 0 ; j< cols ;j++) {
				if(this.board[i][j].getWall(Direction.EST)) {
					System.out.print("|   ");
				}
				else {
					System.out.print("    ");
				}
				
			}
			System.out.print("|");
			
			
		}
		System.out.println();
		for(int j=0; j<cols; j++) {
			System.out.print("+---");
		}
		System.out.println("+");
		
		
	}
	
	
	
	
	
	
	
	
}
