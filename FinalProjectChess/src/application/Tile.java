package application;

public class Tile {
	public final int x,y;
	public Piece currentlyHeld;

	public Tile(int x, int y, Piece currentlyHeld) {
		this.x = x;
		this.y = y;
		this.currentlyHeld = currentlyHeld;
	}
	public Tile(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public Tile() {
		this.x = 0;
		this.y = 0;
	}
	
	/**
	 * Places a piece on the tile
	 * 
	 * @param toSet piece to be placed on tile
	 */
	public void setPiece(Piece toSet) {
		this.currentlyHeld = toSet;
	}
	
	/**
	 * Returns the piece that is being held in the current tile
	 * 
	 * @return piece being held on the tile
	 */
	
	public Piece getPiece() {
		return currentlyHeld;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return("("+this.x+", "+this.y+")");
	}
	
	/**
	 * 
	 * @return Tiles x
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * 
	 * @return Tiles y
	 */
	public int getY() {
		return y;
	}
	/**
	 * This method needs to be passed a graphics object. <br>
	 * The purpose is for less clutter in the main program <br>
	 * and so any tile can know its own instructions
	 * 
	 */
	public void draw() {
		
	}
	
	
	/**
	 * Every object must be able to update itself, and these will all be called in the main method.
	 * <hr>
	 * Tile will update its currently held piece, its white value and its black value. 
	 */
	
	public void update() {
		// Put all code above draw
		this.draw();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
