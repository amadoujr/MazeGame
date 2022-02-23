package grille;

import java.util.*;

public class Board {
	
	private Cell[][] board ;
	private int rows ;
	private int cols ;
	private List<Cell>neighbours = new ArrayList<>();
	private List<Cell> allUnvisitedNeigbours = new ArrayList<>();
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
	 * @param n the cell that we are searching neighbors
	 * @param heigth the height (rows) of the board
	 * @param width the  width (cols) of the board
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
		Cell rand = null ;
		for(Cell x : this.getNeighboursCells(n)) {
			
			if(!x.isVisited()) {
				this.allUnvisitedNeigbours.add(x);
			}
		}
		Random random = new Random();
		int pos = random.nextInt(this.allUnvisitedNeigbours.size());
		rand = this.allUnvisitedNeigbours.get(pos);
		return rand ;
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
	
	
	
	public void generateMaze() {
		int visite = 1 ;
		// set currentcell as the first cell
				Cell currentCell = this.board[0][0];
				// set the currentcell as visited
				currentCell.setVisited(true);
		while(visite < (this.rows*this.cols)) {
			if(this.hasUnvisitedNeigbor(currentCell)) {
				Cell next = this.chooseRandomCell(currentCell);
				
				currentCell.removeWall(next);
				stack.add(currentCell);
				currentCell = next ;
				
			    currentCell.setVisited(true) ;
			    visite+=1 ;
			    
			}
			else {
				Cell cell = stack.pop() ;
				currentCell = cell ;
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
