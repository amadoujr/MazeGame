package GameTest;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;


import characters.Clue;
import characters.ClueDirection;
import characters.ClueDistance;
import characters.FixeCharacter;
import characters.Heros;

import characters.RandomCharacter;
import characters.Sphynx;
import characters.Trader;
import game.Quest;
import grille.Board;
import grille.Cell;
import objets.Chest;
import objets.Objets;
import objets.Parchemins;

public class CharactersTest {
	
	
	Board b = new Board(5,5);
	
	Quest quest = new Quest(b);
	Clue clueDistance = new ClueDistance(quest);
	Clue clueDirection = new ClueDirection(quest);
	
	
	Cell c1 = b.getCell(1,0);
	Cell c2 = b.getCell(0,1);
	Cell c3 = b.getCell(0,0);
	
	
	Heros heros = new Heros("amadou",c3);
	RandomCharacter trader = new Trader("emma",c2,clueDistance);
	FixeCharacter sphynx = new Sphynx(c1,"lika",clueDirection);
	Objets parchemin = new Parchemins("parchemin" , c3 ,clueDirection) ;
	Objets chest = new Chest("or" , c3 ) ;
	
	
	
	@Test
	
	void moveTest() {
		heros.move(c2);
		trader.move(c3);
		assertTrue(heros.getPosition().equals(c2)) ;
		assertTrue(trader.getPosition().equals(c3)) ;
	
		
	}
	
	
	@Test
	void askTest() {
		heros.setGoldvalue(10);
		assertEquals(heros.ask(sphynx) , clueDirection.giveIndice(heros));
		assertEquals(heros.ask(trader) , clueDistance.giveIndice(trader));
		
	}
	
	
	@Test 
	void PickupTest() {
		List<Objets> objets = new ArrayList<>();
		
		objets.add(parchemin) ;
		objets.add(chest);
		heros.pick_up(parchemin);
		heros.pick_up(chest);
		assertEquals(heros.getAllItems(), objets);
		
		
		
	}
	
		
		
		
}












