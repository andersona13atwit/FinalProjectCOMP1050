package application;

import java.util.ArrayList;


import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.ImageCursor;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Tile {
	public final int x,y;
	public int width = 50;
	public int height = 50;
	public Piece currentlyHeld;
	public Color color;
	public boolean selected;
	public boolean isBlack;
	public Rectangle rectRepresentation;
	public static ArrayList<Tile> tiles = new ArrayList<Tile>();

	public Tile(int x, int y, Piece currentlyHeld) {
		this.x = x;
		this.y = y;
		this.currentlyHeld = currentlyHeld;
		rectRepresentation = new Rectangle(x*width,y*height,width,height);
		tiles.add(this);
		
	}
	public Tile(int x, int y, boolean isBlack) {
		this.x = x;
		this.y = y;
		this.isBlack = isBlack;
		rectRepresentation = new Rectangle(x*width,y*height,width,height);
		tiles.add(this);
		
	}
	public Tile() {
		this.x = 0;
		this.y = 0;
		rectRepresentation = new Rectangle(x*width,y*height,width,height);
		tiles.add(this);
		
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
	 * Used to change the color variable in the tile
	 * 
	 * @param color
	 */
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	/**
	 * Sets selected to be the opposite of what it was (i.e. true -> false).
	 * <br>
	 * If selected becomes true, change the tiles color to gold, and when turned off change it back
	 * 
	 */
	
	public void toggleSelected() {
		selected = !selected;
		if(selected) {
			rectRepresentation.setFill(Color.GOLD);
//			currentlyHeld.toggleSelected();
		}
		else { 
			rectRepresentation.setFill(isBlack?Color.rgb(51, 25, 0,1.0):Color.BLANCHEDALMOND);
		}
	}
	
	
	
	
	/**
	 * This method needs to be passed a graphics object. <br>
	 * The purpose is for less clutter in the main program <br>
	 * and so any tile can know its own instructions
	 * 
	 */
	public Rectangle draw() {
		Tile temp = this;
		
		rectRepresentation.setFill(isBlack?Color.rgb(51, 25, 0,1.0):Color.BLANCHEDALMOND);	
		rectRepresentation.setOnMouseClicked(new EventHandler<Event>() {
			
			@Override
			public void handle(Event arg0) {
				// TODO Auto-generated method stub
				rectRepresentation.setFill(Color.GOLD);
				for(Tile tile : tiles) {
					if(tile.selected) {
						tile.toggleSelected();
						
					}
				}
				temp.toggleSelected();
				System.out.println(temp);
			}
			
			
		});
		return rectRepresentation;
		
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
