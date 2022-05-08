package game;

import java.util.*;
import characters.*;
import grille.Board;
import grille.Cell;
import grille.Direction;

import objets.Objets;

/**
 * Class game
 */

public class Game {
	
	/**
	 * attributes of the class Game
	 * characters : contains all characters present in the game 
     * hero :  Hero attribute
     * samecell : contains all characters present at the same Cell as Hero
     * items : contains all items present in the game
     * quest : refer to the quest
     * board : the board of the game 
	 */
	protected Board board;
	protected List<Characters> characters;
	protected boolean finished;
	protected Quest quest;
	protected Heros hero;
	List<Characters> samecell = new ArrayList<>();	
	List<Objets> items = new ArrayList<>();
	List<Objets> sameItemsCell = new ArrayList<>();
	
	
	

	
	/**
	 * initialize constructor
	 * @param board the board of the game
	 * @param quest 
	 */

	public Game(Board board, Quest quest) {
		this.board = board;
		this.characters = new ArrayList<>();
		this.items = new ArrayList<>() ;
		this.finished = false;
		this.quest = quest;
		
		
	}
	/**
	 * get list of all characters present at the same Cell to the hero
	 * @return the list
	 */
	public List<Characters> getSameCell() {
		return samecell;
	}
	/**
	 * set characters
	 * @param sameCell the list of characters
	 */
	public void setSameCell(List<Characters> sameCell) {
		this.samecell = sameCell;
	}

	/**
	 * get the list of all items
	 * @return all items 
	 */
	public List<Objets> getItems() {
		return items;
	}
	/**
	 * set items
	 * @param objets
	 */
	public void setItemsCell(List<Objets> objets) {
		this.sameItemsCell = objets;
	}
	
	/**
	 * this methods allow us to add items in the game
	 * @param o the items to add
	 */
	public void addItems(Objets o) {
		 this.items.add(o);
	}
	
	/**
	 * add character in the game
	 * @param p character to add
	 */
	public void addCharacter(Characters p) {
		this.characters.add(p);
	}
	/**
	 * @return all characters presents in the game
	 */
	public List<Characters> getCharacters() {
		return this.characters;
	}

	/**
	 * @return true if the game is finished , false else
	 */
	public boolean isFinished() {
		return this.quest.getQuest(hero);
	}
	
	/**
	 * add the hero to the game
	 * @param hero hero to add
	 */
	public void setHeros(Heros hero) {
		this.hero = hero;
	}
	/**
	 * @return get hero
	 */
	public Heros getHeros() {
		return this.hero;
	}
	/**
	 * @param b boolean value
	 */
	public void setFinished(boolean b) {
		this.finished = b;
	}
	
	/**
	 * @return the board of the game
	 */
	public Board getBoard(){
		return this.board;
	}
	/**
	 * set the board
	 * @param board the board to set 
	 */
	public void setBoard(Board board) {
		this.board = board;
	}
	
	/**
	 * this methods makes players except heros move randomly from one cell to another cell
	 * if there is no wall in the next cell
	 */
	public void moveOtherCharacter() {
		Random rand = new Random();
			for (Characters c : this.characters) {
				if (!(c instanceof Sphynx)) {
					Cell cell = c.getPosition();
					List<Direction> direction = cell.openCell();
					int n = rand.nextInt(direction.size());
					c.move(board.getNeighbour(cell, direction.get(n)));
				}
			}	
			
	}
		
	
	/**
	 * the goal of this methods is to run the game.
	 */
	
	public void play() {
		int i,j,k;
		System.out.println("vous êtes à la case "+ this.hero.getPosition().toString());
		Cell cell = hero.getPosition();
		System.out.println("ici se trouve : ");
		
		this.setSameCell(this.hero.aroundCell(this.characters));
		for (i=0; i< samecell.size();i++) {
			String res2 = samecell.get(i).getName();
			System.out.println("               "+ res2);
		}
		this.setItemsCell(this.hero.aroundObjets(this.items));
		for(k=0 ; k<this.sameItemsCell.size() ; k++) {
			String item = (sameItemsCell.get(k).getName());
			System.out.println("               "+ item);
		}
		System.out.println("autour c'est : ");

		List<Direction> direction = cell.openCell();
		for (i = 0; i<direction.size();i++) {
			String res =(direction.get(i) + ": case " + this.board.getNeighbour(cell, direction.get(i)));
			System.out.println("         "+ res);
		}
		
		
		while(!this.isFinished()) {
			this.playTurn();
		}
	}
	
	
	
	/**
	 * the game runs as long as the hero has not reached his quest
	 */
	public void playTurn() {
		Scanner scanner = new Scanner(System.in); 
		//System.out.println();
		
		System.out.println();
		System.out.println("----------------------------------------------------");

		System.out.println("Que voulez-vous faire ( taper 'aide' pour menu ) ");
		String res = scanner.nextLine();
		if (res.equalsIgnoreCase("aide")) {
			System.out.println();
			System.out.println("----------------------------------------------------");
			System.out.println("aide - pour obtenir de l'aide ");
			System.out.println("quitte - pour quitter le jeu ");
			System.out.println("interroge - pour interroger le personnage");
			System.out.println("utilse - pour utiliser un objet");
			System.out.println("bouge - pour se deplacer");
			System.out.println("quitte - pour quitter le jeu");


		}
		
		if(res.equalsIgnoreCase("bouge")) {
			this.moveOtherCharacter();
			System.out.println("veuillez choisir une direction : ");
			Cell cell = this.hero.getPosition();
			int i,j;
			List<Direction> direction = cell.openCell();
			for (i = 0; i<direction.size();i++) {
				String str =(i + " - " + direction.get(i));
				System.out.println("         "+ str);
			}
			int scan = scanner.nextInt();
			hero.move(this.board.getNeighbour(cell, direction.get(scan)));
			this.board.Display();
			for(j=0;j<3;j++) {
				System.out.println();
			}
			
			System.out.println("vous êtes à la case : "+ this.hero.getPosition().toString());
			
			System.out.println("ici se trouve : " );
			this.setSameCell(this.hero.aroundCell(this.characters));
			for (i=0; i< samecell.size();i++) {
				String res2 = samecell.get(i).getName();
				System.out.println("               "+ res2);
			}
			this.setItemsCell(this.hero.aroundObjets(this.items));
			for(j=0 ; j<sameItemsCell.size() ; j++) {
				String objet = (sameItemsCell.get(j).getName());
				System.out.println("               "+ objet );
			}
			System.out.println();

		}
		
		if(res.equalsIgnoreCase("interroge")) {
				
			System.out.println("qui voulez vous interroger ?");
			int i  ;
			for(i=0;i<samecell.size();i++) {
				String ask = (i + " - "+ samecell.get(i).getName());
				System.out.println("         "+ ask);
			}
			
			
			int scan = scanner.nextInt() ;
			System.out.println("joueur avec " +  this.hero.getGoldValue()  + " or  " + "interroge " + samecell.get(scan).toString());
			System.out.println(this.hero.ask(samecell.get(scan)));
			
		
		}
		
		

		if (res.equalsIgnoreCase("regarde")) {
			
			System.out.println("----------------------------------------------------");

			System.out.println("vous êtes à la case "+ this.hero.getPosition().toString());
			int k,i,j;
			
			System.out.println("ici se trouve :");
			this.setSameCell(this.hero.aroundCell(this.characters));
			for (i=0; i< samecell.size();i++) {
				String res2 = samecell.get(i).getName();
				System.out.println("               "+ res2);
			}
			for(j=0 ; j<sameItemsCell.size() ; j++) {
				String objet = (sameItemsCell.get(j).getName());
				System.out.println("                  "+ objet);
			}
			System.out.println("autour c'est : ");

			List<Direction> direct = this.hero.getPosition().openCell();
			for (k = 0; k<direct.size();k++) {
				String str =(direct.get(k) + ": case " + this.board.getNeighbour(this.hero.getPosition(), direct.get(k)));
				System.out.println("         "+ str);
			}
			
			
		}
				
		
		if(res.equalsIgnoreCase("utilise")) {
			System.out.println("que voulez vous utiliser ?");
			//Cell cell = this.hero.getPosition();
			
			int j ;
			for(j=0 ; j<sameItemsCell.size() ; j++) {
				String objet = (j + " - " + sameItemsCell.get(j).getName());
				System.out.println("         "+ objet);
			}
			
			int scan = scanner.nextInt() ;
			System.out.println("joueur avec " +  this.hero.getGoldValue()  + " or  " + "utilise " + sameItemsCell.get(scan).toString()+" :");
			this.hero.use_Items(sameItemsCell.get(scan));	

		}
		
		if(res.equalsIgnoreCase("quitte")) {
			System.out.println("merci d'avoir joué !!");
			System.out.println(" bye, bye");
			System.exit(0);
	
		}
		
		if(this.isFinished()) {
			System.out.println("bravoo !! vous avez réussi,le jeu est fini ");
		}
	
	}
	
}
	

      

	
	
