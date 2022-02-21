package grille;


public class Boardmain {

	public static void main(String[] args) {
		Board b = new Board(8,8);
		b.Display() ;
		Cell current =  b.getCell(0,1);
		b.getCell(0, 0).setVisited(true);
		System.out.println(b.getCell(0, 0).isVisited());
		int x = 0;
		for(int i=0;i< b.getrows();i++) {
			for (int j=0; j<b.getcols();j++) {
				if(b.getCell(i, j).isVisited()){
					x+=1;
				}
			}
		}
		System.out.println(x);
		System.out.println(b.getCell(0,0).isVisited());
		System.out.println(current.chooseRandomCell());
		System.out.println(current.getNeigbour());
		
		
		
		
		
		
		
		


		
		
		
		
		

	}
}
