package grille;

/**
 * @author amadouu
 * an enum representing the key of our walls
 */
public enum Direction {
	
	EAST(0,1,"Est"),SOUTH(1,0,"Sud"),WEST(0,-1,"Ouest"),NORTH(-1,0,"Nord");
	
	private String name;
	private int x;
	private int y;
	
	
	Direction(int i, int j, String name) {
		// TODO Auto-generated constructor stub
		this.x =i;
		this.y = j;
		this.name = name;
	}
	
	/**
	 * @return x
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * @return y
	 */
	public int getY() {
		return y;
	}
	
	public String getName() {
		return this.name;
	}
	
	
	
 
 
}