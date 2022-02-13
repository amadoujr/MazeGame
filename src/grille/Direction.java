package grille;

/**
 * @author amadouu
 * an enum representing the key of our walls
 */
public enum Direction {EST(5),SUD(5) ;

 private final int coord ;

 private Direction(int coord) {
	this.coord = coord ; 
}

 public int getCoord() {
	return this.coord ; 
}
 
 
 
 
}