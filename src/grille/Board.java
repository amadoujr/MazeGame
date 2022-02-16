package grille;



public class Board {
	private boolean finished;
	private Cell[][] board ;
	private int rows ;
	private int cols ;
	private Cell currentCell;
	
	public Board(int rows ,int cols) {
		this.finished= false;
		this.rows = rows ;
		this.cols = cols; 
		this.board = new Cell[rows][cols];
		for(int i = 0 ; i < rows ; i++ ) {
			for(int j = 0 ; j< cols ; j++) {
				this.board[i][j] = new Cell(i,j);
				
			}
		}
		currentCell = this.board[0][0];
		currentCell.set_isVisited(true);
		
		
		for(int i = 0 ; i < rows ; i++ ) {
			for(int j = 0 ; j< cols ; j++) {
				this.board[i][j].addNeigbors(this.board[i][j],rows,cols);
			}
		}
		
		// set currentcell as the first cell
		currentCell = this.board[0][0];
		// set the currentcell as visited
		currentCell.set_isVisited(true);
		
	
		
		
		
		
		
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
	
	public boolean isfinished() {
		return this.finished;
	}
	
	
	
	
	
	
	
}
