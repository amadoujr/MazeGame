package grille;

/**
 * @author amadouu
 *
 */
public class Board {
	private Cell[][] board ;
	private int rows ;
	private int cols ;
	
	
	
	
	/**
	 * Initializing the board
	 * @param rows of the board
	 * @param cols of the board
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
		
		// set currentcell as the first cell
		Cell curentCell = this.board[0][0];
		// set the currentcell as visited
		curentCell.set_isVisited(true);
		
		
	}
	
	

	/**
	 * @param x the position in the cell
	 * @param y the position in the cell
	 * @return
	 */
	public Cell getCell(int x , int y) {
		
		return this.board[x][y];
	}
	
	
	
	/**
	 * display the board
	 */
	public void Display() {
		for(int i = 0 ; i<rows ; i++) {
			System.out.println() ;
			for(int j = 0 ; j< cols ;j++) {
				System.out.print(" | "+ this.board[i][j].toString()+ " | ");
				
			}
			
			
		}
		System.out.println();
	}
	
	
	
	
	
}
