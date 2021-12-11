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
	public boolean isAlive;
	public int x;
	public int y;
	public boolean hasMoved = false;
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
	 * Changes the piece's selected state between true or false<br>
	 * and updates tile colors accordingly
	 */
	
	public void toggleSelected() {
		isSelected = !isSelected;
		if(isSelected) {
//			System.out.println(this.toString()+" has been selected!!");
			for(Tile tile : canMoveTo) {
				tile.rectRepresentation.setFill(Color.GREENYELLOW);
			}
		}
		else {
			for(Tile tile : canMoveTo) {
				tile.rectRepresentation.setFill(tile.isBlack?Color.rgb(51, 25, 0,1.0):Color.BLANCHEDALMOND);
			}
		}
	}
	
	
	
	/**
	 * This method will calculate the moves to fill canMoveTo every time the piece location is updated
	 */
	
	protected abstract void calcMoves();
	
	/**
	 * Sets the location for the piece to be the new provided tile,<br>
	 * as well as setting the old tile to be holding no piece<br>
	 * and updating the images
	 * 
	 * @param newLocation
	 */
	public void setLocation(Tile newLocation, Grid grid) {
		// TODO Auto-generated method stub
//			grid.root.getChildren().remove(location.currentlyHeld.imageView);
		location.currentlyHeld = null;
		location = newLocation;
		
		update();
	}
	
//	public void hasMoved() {
//		if(this instanceof Pawn) {
//			
//		}
//	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getClass().getSimpleName();
	}
}
