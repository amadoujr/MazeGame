package game;
import java.util.*;
import character.Heros;
import grille.Board;


public class Play {
	
	protected Board board;
	protected List<Character> characters;
	protected boolean finished;
	protected Quest quest;
	protected Heros hero;
	
	public Play(Board board, Quest quest) {
		this.board = board;
		this.characters = new ArrayList<>();
		this.finished = false;
		this.quest = quest;
		
	}
	
	
	public void addCharacter(Character p) {
		this.characters.add(p);
	}
	
	public boolean isFinished() {
		return this.quest.getQuest(hero);
	}
	
	public void setHeros(Heros hero) {
		this.hero = hero;
	}
	
	public Heros getHeros() {
		return this.hero;
	}
	
	public void setFinished(boolean b) {
		this.finished = b;
	}
	
	public Board getBoard(){
		return this.board;
	}
	
	public void setBoard(Board board) {
		this.board = board;
	}
	
	
	
	

}
