package application;

import javafx.event.EventHandler;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Tile {
	public final int x,y;
	public int width = 50;
	public int height = 50;
	public Piece currentlyHeld;
	public Color color;

	public Tile(int x, int y, Piece currentlyHeld) {
		this.x = x;
		this.y = y;
		this.currentlyHeld = currentlyHeld;
	}
	public Tile(int x, int y, Color color) {
		this.x = x;
		this.y = y;
		this.color = color;
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
	public Rectangle draw() {
		Rectangle toReturn = new Rectangle(x*width,y*height,25,25);
		toReturn.setFill(color);
//		toReturn.setOnMouseClicked(EventHandler<Event>());
		return toReturn;
		
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
