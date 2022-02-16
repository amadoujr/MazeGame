package grille;


public class Boardmain {

	public static void main(String[] args) {
		Board b = new Board(5,5);
		b.Display();
		Cell current = b.getCell(0, 1);
		System.out.println(current.chooseRandomCell()); /** doit afficher 2( vu que Cell(0,0)
		est à true dans  classe Board ) mais affiche 3 */
		
		
		
		
		
		
		
		


		
		
		
		
		

	}
}
