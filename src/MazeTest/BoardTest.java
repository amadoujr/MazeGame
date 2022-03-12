package MazeTest;

import grille .*;
import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.Test;



class BoardTest {

	
	Cell c1 = new Cell(0,0);
	Cell c2 = new Cell(0,1);
	Cell c3 = new Cell(1,0);
	Board b = new Board(5,5);
	
	@Test
	void addNeigboursTest() {
		
		assertEquals(b.getNeighbor(c1).get(0),b.getCell(1, 0));
		assertEquals(b.getNeighbor(c1).get(1),b.getCell(0, 1));
		
	
	}
	@Test
	void hasUnvisitedNeigboursTest() {
		
		Cell c1 = b.getCell(1,0);
		c1.setVisited(true);
		Cell c2 = b.getCell(0,1);
		c2.setVisited(true);
		Cell c = b.getCell(0, 0);
		assertFalse(b.hasUnvisitedNeigbor(c));
		
		
		
	}
	@Test
	void ChooseTest() {
	
		Cell c3 = b.getCell(1,0);
		Cell c2 = b.getCell(0, 1);
		Cell c1 = b.getCell(0, 0);
		c3.setVisited(true);
		assertEquals(b.chooseRandomCell(c1) , c2);
		
	}
	
}
