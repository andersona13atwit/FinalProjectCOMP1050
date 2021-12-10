  package application;


import java.util.ArrayList;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;


public abstract class Piece {
	public Tile location;
	public ArrayList<Tile> canMoveTo = new ArrayList<Tile>();
	public boolean isSelected;
	public boolean isBlack;

	public int x;
	public int y;
	
	public Image image;
	public ImageView imageView;

	
	Piece(Tile location ,boolean isBlack){
		this.location = location;
		this.x = location.x;
		this.y = location.y;
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
	public void update() {
		this.x = location.x;
		this.y = location.y;
		imageView.setX(x * 50-2);
		imageView.setY(y* 50-2);
		calcMoves();
		
	}
	
	/**
	 * This method needs to be passed a graphics object. <br>
	 * The purpose is for less clutter in the main program <br>
	 * and so any piece can know its own instructions
	 * 
	 */
	public abstract void draw();

	public void toggleSelected() {
		isSelected = !isSelected;
		if(isSelected) {
			System.out.println(this.toString()+" has been selected!!");
			for(Tile tile : canMoveTo) {
//				System.out.println(tile);
				tile.rectRepresentation.setFill(Color.GREENYELLOW);
			}
		}
		else {
			for(Tile tile : canMoveTo) {
				
				tile.rectRepresentation.setFill(isBlack?Color.rgb(51, 25, 0,1.0):Color.BLANCHEDALMOND);
			}
		}
	}
	
	
	
	/**
	 * This method will calculate the moves to fill canMoveTo every time the piece location is updated
	 */
	
	protected abstract void calcMoves();
	
	
	public void setLocation(Tile temp) {
		// TODO Auto-generated method stub
		location.currentlyHeld = null;
		location = temp;
		update();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getClass().getSimpleName();
	}
}
