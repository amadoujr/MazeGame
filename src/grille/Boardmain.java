package grille;


public class Boardmain {

	public static void main(String[] args) {

		Board b = new Board(5,8);
		
		//b.getCell(0,0).set_Wall(Direction.EST,false);
		//Cell test = b.getCell(2,3);
		//Cell x = b.getCell(2,2);
		//test.removeWall(x);
		b.Display();
		
	    //test.getNeigbour();
		
		Cell current =  b.getCell(0, 1);
		//System.out.println(current.chooseRandomCell());
		System.out.println(current.addUnvisitedCell());
		//System.out.println(current);
		System.out.println(current.chooseRandomCell()); 
		
		int v = 0 ;
		for(int i = 0 ; i < b.getrows(); i++) {
			for (int j = 0 ; j<b.getcols(); j++) {
				if(b.getCell(i,j).isVisited()){
					v+=1 ;
				}
						
				
			}
		}
		System.out.println(v);
		System.out.println(b.getCell(0, 0).isVisited());
		
			
		
		

			
		}
			
		
		
		
		
		

	}

