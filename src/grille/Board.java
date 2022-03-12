package grille;

import java.util.*;

public class Board {
	protected boolean finished;
	protected Cell[][] board ;
	protected int rows ;
	protected int cols ;
	protected Stack<Cell> stackCell = new Stack<>();
	protected List<Cell> neighbours ; 
	
	
	public Board(int rows ,int cols) {
		this.finished= false;
		this.neighbours = new ArrayList<>();
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
		this.board[0][0].setVisited(true);
		
		//this.generateMaze();
		
	}
	
	/**
	 * @param n the cell that we are searching neighbors
	 * @param heigth the height (rows) of the board
	 * @param width the  width (cols) of the board
	 */
	public void addNeigbors(Cell n ) {
		
		if (n.getX() > 0) {
			this.neighbours.add( this.board[n.getX()-1][n.getY()] );
		}
		if (n.getY() > 0) {
			this.neighbours.add( this.board[n.getX()][n.getY()-1] );		}
		if (n.getX() < this.rows-1) {
			this.neighbours.add( this.board[n.getX()+1][n.getY()] );			}
		if (n.getY() < this.cols-1) {
			this.neighbours.add( this.board[n.getX()][n.getY()+1] );		}
		
		
	}
	
	/**
	 * @return list of neighbors in the Board
	 */
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
	 * display the board
	 */
	public void Display() {
		for(int i = 0 ; i<rows ; i++) {
			System.out.println() ;
			for(int j = 0 ; j< cols ;j++) {
				if(this.board[i][j].get_Wall(Direction.SUD)) {
					System.out.print("+---");
				}
				else {
					System.out.print("+   ");
				}
			}
			System.out.println("+");
			for (int j = 0 ; j< cols ;j++) {
				if(this.board[i][j].get_Wall(Direction.EST)) {
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
				this.stackCell.add(currentCell);
				currentCell = random;
				currentCell.setVisited(true);
				visi+=1;
			}
			else if (!this.stackCell.empty()) {
					currentCell = this.stackCell.pop();
				}
			else {
				System.out.println("FINISHED");
			}
		}

	
	}
	
	public void generateExhaustif() {
		// set currentcell as the first cell
		
		Cell currentCell = this.board[0][0];	
		currentCell.setVisited(true);
		this.stackCell.add(currentCell);
			
		while (!this.stackCell.isEmpty()) {
			Cell first = this.stackCell.pop();
			if (this.hasUnvisitedNeigbor(first)) {
				this.stackCell.add(first);
				Cell random = this.chooseRandomCell(first);
				first.removeWall(random);
				random.setVisited(true);
				this.stackCell.add(random);
			}
			
		}
	
	}
	
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
		
		this.Display();
		
	}
	
		
}