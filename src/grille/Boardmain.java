package grille;

public class Boardmain {

	public static void main(String[] args) {
		Board b = new Board(4,5);
		//b.Display();
		//b.getCell(2,4 ).set_Wall(Direction.SUD,false);
		b.Display();
		Cell test = b.getCell(2,2 );
	    test.getNeigbour();
		


		
		
		
		
		

	}
}
