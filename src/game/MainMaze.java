package game;
import grille.*;
import characters.*;
import objets.*;
import java.util.*;




public class MainMaze {
	public static void main(String[] args) {
		
		/** generate and display the maze */
		
		Board board = new Board(10,10);
		board.Display();
		board.choice();		
		
		
		//creates the quest
		
		Quest quest = new Quest(board);
		
		Game game = new Game(board,quest);
		
		System.out.println();
		
		/* the hero position */
		Cell position = board.getCell(0,0);
		Heros h = new Heros("hero",position);
		
		// add the hero to the game
		game.setHeros(h);
		
		Clue clue;
		
		Random random = new Random();
		float f = random.nextFloat();
		
		if (f > 0.5) {
			clue = new ClueDistance(quest);
		}
		else {
			clue = new ClueDirection(quest);

		}
		
		Parchemins p;
		Chest c;

		
		
		// creates list of 30 items to put in the game
		List<Objets> li = new ArrayList<>();
		Random rand = new Random();
		int x,y;
		int i;
		for (i=0; i<31;i++){
			x = rand.nextInt(10);
			y = rand.nextInt(10);
			if ( i < 15) {
				p = new Parchemins("Parchemins"+"-"+i,board.getCell(x, y),clue);
				li.add(p);
			}
			else {
				c = new Chest("Or"+"-"+(i-15),board.getCell(x, y));
				li.add(c);
			}
		}
		
		// put the items in the game
		for (i=0;i<li.size();i++) {
			game.addItems(li.get(i));
		} 
	
		// creates a list which contains 20 characters and put them in th game 
		
		List<Characters> characters = new ArrayList<>();
		
		Characters trader,sphynx,altruist,mad_man;
		
		for(i=0;i<5;i++) {
			x = rand.nextInt(10);
			y = rand.nextInt(10);
			trader = new Trader("marchand"+"-"+i ,board.getCell(x, y),clue);
			characters.add(trader);
		}
		
		for(i=0;i<5;i++) {
			x = rand.nextInt(10);
			y = rand.nextInt(10);
			sphynx = new Sphynx(board.getCell(x, y) ,"sphynx"+"-"+i,clue);
			characters.add(sphynx);
		}
		
		for(i=0;i<5;i++) {
			x = rand.nextInt(10);
			y = rand.nextInt(10);
			altruist = new Altruiste("altruist"+"-"+i ,board.getCell(x, y),clue);
			characters.add(altruist);
		}
		
		for(i=0;i<5;i++) {
			x = rand.nextInt(10);
			y = rand.nextInt(10);
			mad_man = new MadCharacter("fou"+"-"+i ,board.getCell(x, y),clue);
			characters.add(mad_man);
		}
		
		for(Characters carac : characters) {
			game.addCharacter(carac);
		}
				
		
		//game.play();
		
		
		
		
		
		
		
	}

}
