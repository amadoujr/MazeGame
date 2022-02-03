package grille;
import java.util.* ;

public class Board {
	private Cell[][] tab ;
	private int rows ;
	private int cols ;
	
	
	
	
	public Board(int rows ,int cols) {
		this.rows = rows ;
		this.cols = cols; 
		this.tab = new Cell[rows][cols];
		for(int i = 0 ; i < rows ; i++ ) {
			for(int j = 0 ; j< cols ; j++) {
				this.tab[i][j] = new Cell(i,j);
			}
		}
		
		
		
	}
	
	

	public Cell getCell(int h , int w) {
		
		return this.tab[h][w];
	}
	
	
	
	public void Display() {
		for(int i = 0 ; i<rows ; i++) {
			System.out.println() ;
			for(int j = 0 ; j< cols ;j++) {
				System.out.print(this.tab[i][j]);
				
			}
			
			
		}
		System.out.println();
	}
	
	
	
	
	
}
