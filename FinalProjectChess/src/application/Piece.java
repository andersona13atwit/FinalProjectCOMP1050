package application;

public abstract class Piece {
	public Tile location;
	public Tile[] canMoveTo;
	public boolean isSelected;
	
	
	
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
