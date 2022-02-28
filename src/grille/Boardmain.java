package grille;


public class Boardmain {

	public static void main(String[]args) {
		Board b = new Board(5,5);

		//b.getCell(0, 0).setVisited(true);
		b.generateMaze();
		//System.out.println(b.chooseRandomCell(b.getCell(0, 1)));
		//System.out.println(b.hasUnvisitedNeigbor(b.getCell(0, 1)));
		b.Display();

		
		


		
		
		
		
		
		
		


		
		
		
		
		

	}
}
