package grille;

public class Boardmain {

	public static void main(String[] args) {
		Board b = new Board(7,6);
		//b.Display();
		b.getCell(2, 3).set_Wall(Direction.OUEST,false);
		b.Display();




	}
}
