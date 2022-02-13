package grille;

public class Boardmain {

	public static void main(String[] args) {
		Board b = new Board(4,5);
		b.Display();
		//b.getCell(2, 2).set_Wall(Direction.NORD,false);
		//b.Display();
	
		Cell current = b.getCell(2, 2);
		current.addNeigbors(current);
		System.out.println(current.getNeigbor());



	}
}
