package application;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public abstract class Piece {
	public Tile location;
	public Tile[] canMoveTo;
	public boolean isSelected;
	public boolean isBlack;
	public int x;
	public int y;
	

	
	Piece(int x,int y,boolean isBlack){
		this.x = x;
		this.y = y;
		this.isBlack = isBlack;

	}
	/**
	 * 
	 * @return piece x
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * 
	 * @return piece y
	 */
	public int getY() {
		return y;
	}
	public boolean pieceColor() {
		return isBlack;
	}
	/**
	 * Every piece must be able to move, and how it does so is unique to each type.
	 * 
	 * @return Success State on Movement <br>
	 * <ul>
	 * 
	 * 1. Successful <br>
	 * 0. Not Possible <br>
	 * -1. Error
	 * </ul>
	 */
	public abstract int move();
	
	/**
	 * Every object must be able to update itself, and these will all be called in the main method.
	 * <hr>
	 * Each piece will update its location, its current status, the tiles it can move to, and its (value (?))
	 */
	public abstract void update();
	
	/**
	 * This method needs to be passed a graphics object. <br>
	 * The purpose is for less clutter in the main program <br>
	 * and so any piece can know its own instructions
	 * 
	 */
	public abstract void draw();

	protected abstract void toggleSelected();
	
	protected abstract void calcMoves();
}
