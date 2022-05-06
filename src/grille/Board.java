package grille;

import java.util.*;

import characters.*;  
public class Board {
	
	private Cell[][] board ;
	private int rows ;
	private int cols ;
	private Stack<Cell> stackcell = new Stack <>();
	
	/**
	 * initialize the constructor
	 * @param rows : number of rows of the board
	 * @param cols : number of columns of the board
	 */
	public Board(int rows ,int cols) {
		
		this.rows = rows ;
		this.cols = cols; 
		this.board = new Cell[rows][cols];
		for(int i = 0 ; i < rows ; i++ ) {
			for(int j = 0 ; j< cols ; j++) {
				this.board[i][j] = new Cell(i,j);
				
			}
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

	/**
	 * this methods allows us to choose a random neighbors for a cell
	 * @param n the cell
	 * @return the random choosen cell
	 */
	public Cell chooseRandomCell(Cell n) {

		List<Cell> allUnvisitedNeigbours = new ArrayList<>();

		Cell rand = null ;
		allUnvisitedNeigbours = new ArrayList<>();

		for(Cell x : this.getNeighboursCells(n)) {
			
			if(!x.isVisited()) {
				allUnvisitedNeigbours.add(x);
			}
		}

		Random random = new Random();
		int pos = random.nextInt(allUnvisitedNeigbours.size());
		rand = allUnvisitedNeigbours.get(pos);
		return rand ;
	}
	
	public Cell getNeighbour(Cell cell, Direction key) {
		switch(key) {
		case NORTH:
			return this.getCell(cell.getX()+1, cell.getY());			
		case SOUTH:
			return this.getCell(cell.getX()-1, cell.getY());
		case EAST:
			return this.getCell(cell.getX(), cell.getY()-1);
		case WEST:
			return this.getCell(cell.getX(), cell.getY()+1);
		default:
			return null;
		}
		
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
	
	
	public boolean allvisited() {
		for (int i = 0 ; i<this.rows ; i++) {
			for (int j = 0 ; j< this.cols ; j++) {
				if(!this.board[i][j].isVisited()) {
					return false;
				}
			}
		}return true ;
	}
	
	 /**
	 * it's generate the maze 
	 */

	
	
	
	public void generateRecursif() {
		int visite = 1 ;
		int totalcell = this.rows*this.cols;


		Cell currentCell = this.board[0][0];
		// set the currentcell as visited
		currentCell.setVisited(true);
		while(visite < totalcell) {
			if(this.hasUnvisitedNeigbor(currentCell)) {
				Cell next = this.chooseRandomCell(currentCell);
				currentCell.removeWall(next);
				stackcell.add(currentCell);
				currentCell = next ;

				

	 		    currentCell.setVisited(true) ;
	 		   visite+=1 ;
			    
			} 
	 		else if(!this.stackcell.empty()) {
				
	 			currentCell =this.stackcell.pop() ;
	 			
				
	 		}
	 	else {
	 		System.out.println("FINISHED");
	 	}
		
		}
	
	 }
	
	
	/**
	 * generate the maze using an iterative implementation
	 */
	
	public void generateExhaustif() {
		// set currentcell as the first cell
		
		Cell currentCell = this.board[0][0];	
		currentCell.setVisited(true);
		this.stackcell.add(currentCell);
			
		while (!this.stackcell.isEmpty()) {
			Cell first = this.stackcell.pop();
			if (this.hasUnvisitedNeigbor(first)) {
				this.stackcell.add(first);
				Cell random = this.chooseRandomCell(first);
				first.removeWall(random);
				random.setVisited(true);
				this.stackcell.add(random);
			}
			
		}
	
	}
	
	/**
	 * this methods will allow us to generate the maze between the recursive or the iterative 
	 * implementation
	 */
	
	public void choice() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in) ;
		 
		 System.out.println("On vous propose deux algorithmes pour generer le labyrinthe "  + ":" + " Exhaustif - Récursif  Veuillez choisir  ");

		 String rep = sc.nextLine() ;
		 System.out.println();

	     System.out.println("Vous avez choisis : " + rep ) ;		
		 if(rep.equalsIgnoreCase("Exhaustif")){
			 generateExhaustif() ;
			 this.Display();
		 }

		if(rep.equalsIgnoreCase("Recursif")){
			generateRecursif();
			this.Display();
			
		}
		
	}
	
	/*	

	 * display the board
	 */
	public void Display() {
		for(int i = 0 ; i<rows ; i++) {
			System.out.println() ;
			for(int j = 0 ; j< cols ;j++) {
				if(this.board[i][j].getWall(Direction.SOUTH)) {
					System.out.print("+---");
				}
				else {
					System.out.print("+   ");
				}
			}
			System.out.println("+");
			for (int j = 0 ; j< cols ;j++) {
				if(this.board[i][j].getWall(Direction.EAST)) {
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

		}
		
		
		public void addHeros() {
			
		}
	
    


}








	
	

