package game;

import java.util.*;
import characters.*;
import characters.RandomCharacter;
import grille.Board;
import grille.Cell;
import grille.Direction;
import objets.Chest;
import objets.Objets;

public class Game {
	protected Board board;
	protected List<RandomCharacter> characters;
	protected boolean finished;
	protected Quest quest;
	protected Heros hero;
	//protected Objets objets;
	 List<Objets> objets = new ArrayList<>();
	List<RandomCharacter> sameCell = new ArrayList<>();
	List<RandomCharacter> pers = new ArrayList<>() ;
	
	

	
	/**
	 * constructor
	 * @param board
	 * @param quest
	 */


	public List<RandomCharacter> getPers() {
		return pers;
	}



	public void setPers(List<RandomCharacter> pers) {
		this.pers = pers;
	}




	public Game(Board board, Quest quest) {
		this.board = board;
		this.characters = new ArrayList<>();
		this.objets = new ArrayList<>() ;
		this.finished = false;
		this.quest = quest;
		
		
	}
	
	/**
	 * @return all items 
	 */
	public List<Objets> getObjets() {
		return objets;
	}

	public void setObjets(List<Objets> objets) {
		this.objets = objets;
	}
	
	public void addObjets(Objets o) {
		 this.objets.add(o);
	}
	
	/**
	 * @return all characters presents in the same cell that's the hero is
	 */

	public void addpers() {
		for(RandomCharacter c : this.getCharacters()) {
			if(this.hero.getPosition().equals(c.getPosition())) {
				this.pers.add(c) ;
			}
		}
		
		
	}
	
	public List<RandomCharacter> sameCell(){
		for (RandomCharacter c : this.getCharacters()) {
			if ( this.hero.getPosition().equals(c)) {
				sameCell.add(c);
				System.out.println(c.getName());
			}
		}

		return sameCell;
	}
	
	
	/**
	 * add character in the maze
	 * @param p character to add
	 */
	public void addCharacter(RandomCharacter p) {
		this.characters.add(p);
	}
	/**
	 * @return all characters presents in the game
	 */
	public List<RandomCharacter> getCharacters() {
		return this.characters;
	}

	/**
	 * @return true is the game is finished 
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
	
	public void setFinished(boolean b) {
		this.finished = b;
	}
	
	/**
	 * @return return the board of the game
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
	 * this methods makes players except heros move from one cell to another cell
	 * if there is no wall in the next cell
	 */
	public void moveOtherCharacter() {
		Random rand = new Random();
			for (RandomCharacter c : this.characters) {
				Cell cell = c.getPosition();
				List<Direction> direction = cell.openCell();
				int n = rand.nextInt(direction.size());
				c.move(board.getNeighbour(cell, direction.get(n)));
				System.out.println("position " + c.getPosition());

				//System.out.println(c.toString() + "se trouve à la posi "+ cell );

				}	
			
	}
	/*
	public void moveHero() {
		Random random = new Random();
		int i;
		Cell cell = hero.getPosition();
		List<Direction> direction = cell.openCell();
		for (i = 0; i<direction.size();i++) {
			String res =(direction.get(i) + ": case " + this.board.getNeighbour(cell, direction.get(i)));
			System.out.println("         "+ res);
		}
		int n = random.nextInt(direction.size());
		hero.move(this.board.getNeighbour(cell, direction.get(n)));
		
		
	}
	*/
	
	
	
	/**
	 * play the game  
	 */
	
	public void play() {
		int i;
		System.out.println("vous êtes à la case "+ this.hero.getPosition().toString());
		Cell cell = hero.getPosition();
		System.out.println("autour c'est : ");

		List<Direction> direction = cell.openCell();
		for (i = 0; i<direction.size();i++) {
			String res =(direction.get(i) + ": case " + this.board.getNeighbour(cell, direction.get(i)));
			System.out.println("         "+ res);
		}
		int j=0 ;
		while(!this.isFinished() && j< 5) {
			this.playTurn();
			j++;
		}
	}
	
	
	
	
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

			//System.out.println("----------------------------------------------------");

		}
		
		if(res.equalsIgnoreCase("bouge")) {
			this.moveOtherCharacter();
			System.out.println("veuillez choisir une direction : ");
			Cell cell = this.hero.getPosition();
			int i;
			List<Direction> direction = cell.openCell();
			for (i = 0; i<direction.size();i++) {
				String str =(i + " - " + direction.get(i));
				System.out.println("         "+ str);
			}
			int scan = scanner.nextInt();
			hero.move(this.board.getNeighbour(cell, direction.get(scan)));
			System.out.println("----------------------------------------------------");
			
			System.out.println("vous êtes à la case : "+ this.hero.getPosition().toString());
			
			System.out.println("ici se trouve : " );
			sameCell = this.hero.aroundCell(this.characters);
			for (i=0; i< sameCell.size();i++) {
				String res2 = sameCell.get(i).getName();
				System.out.println("               "+ res2);
			}
		}
		
		if(res.equalsIgnoreCase("interroge")) {
			
		System.out.println("qui voulez vous interroger ?");
		int i ;
		List<RandomCharacter> pers = new ArrayList<>() ;
		Cell cell = this.hero.getPosition();
		for(i=0;i<sameCell.size();i++) {
			String ask = (i + "- "+ sameCell.get(i).getName());
			System.out.println("         "+ ask);
			
		
		System.out.println("qui voulez vous interroger ?");
		//Cell cell = this.hero.getPosition();
		

		for(i=0 ; i<pers.size() ; i++) {
			String str =(i + " - " + pers.get(i).toString());
			System.out.println("         "+ str);
		}
		
		int scan = scanner.nextInt() ;
		System.out.println("joueur avec " +  this.hero.getGoldValue()  + " or  " + "interroge " + pers.get(scan).toString() );
		
		System.out.println(this.hero.ask(pers.get(scan))) ;
			
		}
		
		
				
			
		if (res.equalsIgnoreCase("regarde")) {
			
			System.out.println("----------------------------------------------------");
			
			System.out.println("vous êtes à la case "+ this.hero.getPosition().toString());
			
			 
			System.out.println("autour c'est : ");

			List<Direction> direction = this.hero.getPosition().openCell();
			for (i = 0; i<direction.size();i++) {
				String str =(direction.get(i) + ": case " + this.board.getNeighbour(this.hero.getPosition(), direction.get(i)));
				System.out.println("         "+ str);
			}
		}
		

		
		
		if(res.equalsIgnoreCase("quitte")) {
			
			System.out.println(" bye bye ");
		
		}
		
		
		if(res.equalsIgnoreCase("utilise")) {
			System.out.println("que voulez vous utiliser ?");
			//Cell cell = this.hero.getPosition();
			
			for (Objets o : this.getObjets()) {
					
			    System.out.println(0 + " - " + "none");
				System.out.println(1 + " - " + o.getName());
				System.out.println("joueur avec " +  this.hero.getGoldValue()  + " or  " + " utilise " + o.toString());
				this.hero.use_Items(o) ;
				
				}
				
				System.out.println("joueur avec " +  this.hero.getGoldValue()  + " or " + " utilise " + o.toString());
				this.hero.use_Items(o);
			
			} 		
		}
	
	
	
		
		}
		}
	}

	
	
	


