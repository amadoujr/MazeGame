package grille;

import java.util.*;

public class Board {
	
	private Cell[][] board ;
	private int rows ;
	private int cols ;

	private Stack<Cell> stackcell = new Stack <>();
	
	public Board(int rows ,int cols) {
		
		this.rows = rows ;
		this.cols = cols; 
		this.board = new Cell[rows][cols];
		for(int i = 0 ; i < rows ; i++ ) {
			for(int j = 0 ; j< cols ; j++) {
				this.board[i][j] = new Cell(i,j);
				
			}
		}

		this.board[0][0].setVisited(true);
		
	
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


	
	/*	

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
	
	public List<Cell> getNeighbor(Cell cell){
		List<Cell> test = new ArrayList<>();

		if (cell.getX() > 0) {
			test.add( this.board[cell.getX()-1][cell.getY()] );
		}
		if (cell.getY() > 0) {
			test.add( this.board[cell.getX()][cell.getY()-1] );		
		}
		if (cell.getX() < this.rows-1) {
			test.add( this.board[cell.getX()+1][cell.getY()] );
			}
		if (cell.getY() < this.cols -1) {
			test.add( this.board[cell.getX()][cell.getY()+1]);
		
			}
		return test;
	}
	
	public Cell chooseRandomCell(Cell random) {
		Cell randcell = null;
		List<Cell> allunvisitedCell = new ArrayList<>();
		
		for (Cell neigh : this.getNeighbor(random)) {
			if(!neigh.isVisited()) {
				allunvisitedCell.add(neigh);
				
			}
		}
		if(allunvisitedCell.size()>0) {
			Random rand = new Random();
			int pos = rand.nextInt(allunvisitedCell.size());
			randcell = allunvisitedCell.get(pos);
		}
		else {
			return null;
		}
		return randcell;
	}
	
	
	/**
	 * check if the cell which were we are had an
	 * unvisited neighbors
	 * @return true if  it's the case of false if not
	 */
	public boolean hasUnvisitedNeigbor(Cell current) {
		for (Cell neigbour : this.getNeighbor(current)) {
			if(!neigbour.isVisited()) {
				return true ;
			}
		}
		return false;
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
	 * generate the maze by using a Recursive implementation
	 */
	public void generateBackStrack() {
		// set currentcell as the first cell
		
		int nbrtotal = this.rows * this.cols;
		Cell currentCell = this.board[0][0];
		currentCell.setVisited(true);	
		int visi = 1;
			
		while (visi < nbrtotal) {
			if(this.hasUnvisitedNeigbor(currentCell)) {
				Cell random = this.chooseRandomCell(currentCell);
				currentCell.removeWall(random);
				this.stackcell.add(currentCell);
				currentCell = random;
				currentCell.setVisited(true);
				visi+=1;
			}
			else if (!this.stackcell.empty()) {
					currentCell = this.stackcell.pop();
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
	
	public void generateMaze() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Deux types de labyrinthe sont disponibles : Recursif et Exhaustif :");
		System.out.println("lequel d'entre eux vous convient le mieux ?  ");
		System.out.println();
		String result = scan.nextLine();
		System.out.println();
		System.out.println("Trés Bien!");
		if (result.equalsIgnoreCase("exhaustif")) {
			this.generateExhaustif();
		}
		if(result.equalsIgnoreCase("recursif")) {
			this.generateBackStrack();
		}
		
		
	}
	
		
}