package grille;

public class Boardmain {

	public static void main(String[] args) {
		Board b = new Board(3,5);
		//b.Display();
		//b.getCell(2, 3).set_Wall(Direction.EST,false);
		//b.Display();
		Cell current = b.getCell(2, 3);
		Cell next = b.getCell(2, 4);
		current.removeWall(next);
		b.Display();


		
		


	}
}
