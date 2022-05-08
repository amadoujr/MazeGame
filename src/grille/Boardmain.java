package grille;


public class Boardmain {


	public static void main(String[] args) {


		Board b = new Board(5,8);
		Cell c1 = b.getCell(1, 1);
		//b.Display();
		c1.removeWall(b.getCell(0, 1));
		c1.removeWall(b.getCell(1, 0));
		//c1.removeWall(b.getCell(2, 1));

		System.out.println(c1.getWall(Direction.NORTH));
		System.out.println(c1.getWall(Direction.WEST));
		System.out.println(c1.getWall(Direction.SOUTH));
		System.out.println(c1.getWall(Direction.EAST));
		b.choice();;

		
	
		}
			
		
		


}

	

