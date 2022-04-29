package game;

import java.util.*;
import characters.*;
import characters.RandomCharacter;
import grille.Board;
import grille.Cell;
import grille.Direction;
import objets.Objets;

public class Game {
	protected Board board;
	protected List<RandomCharacter> characters;
	protected boolean finished;
	protected Quest quest;
	protected Heros hero;
	protected Objets objets;

	

	public Game(Board board, Quest quest) {
		this.board = board;
		this.characters = new ArrayList<>();
		this.finished = false;
		this.quest = quest;
		
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
		//System.out.println("vous êtes à la case "+ this.hero.getPosition().toString());
		Scanner scanner = new Scanner(System.in); 
		this.moveOtherCharacter();
		//System.out.println();
		//System.out.println("autour c'est : ");
/*
		for (RandomCharacter c : this.characters) {
			//System.out.println(this.hero.aroundCell(c));
			this.moveHero();
			break;

		}*/
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
			System.out.println("veuillez choisir une direction : ");
			Cell cell = this.hero.getPosition();
			int i;
			List<Direction> direction = cell.openCell();
			for (i = 0; i<direction.size();i++) {
				String str =(i + " - " + direction.get(i));
				System.out.println("         "+ str);
			}
			int scan = scanner.nextInt();
			//this.moveHero();
			hero.move(this.board.getNeighbour(cell, direction.get(scan)));
			System.out.println("----------------------------------------------------");
			System.out.println("vous êtes à la case : "+ this.hero.getPosition().toString());
			for (RandomCharacter c : this.characters) {
				System.out.println(this.hero.aroundCell(c));
				break;

			}
		}

		
		//System.out.println("autour c'est : ");
		
		
	}
	
	
	

}
