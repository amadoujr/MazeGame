package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
 
import grille.* ;

public class CellTest {

	
	
	
	
Cell c2 = new Cell(0,1);
Cell c1 = new Cell(0,0);
@Test 
	void Removetest() {
		assertTrue(c2.getWall(Direction.EAST));
		c1.removeWall(c2);
		assertFalse(c2.getWall(Direction.EAST));
		
	}

}
