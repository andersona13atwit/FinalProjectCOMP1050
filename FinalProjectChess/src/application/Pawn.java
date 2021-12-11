package application;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
public class Pawn extends Piece {
//	public boolean hasMoved = false;
	int locationIndex;
	int x;
	int y;
	Pawn(Tile location, boolean isBlack) {
		super(location, isBlack);
		calcMoves();
		if(isBlack) {
			image = new Image("blackpawn.png");
		}
		else {
			image = new Image("whitepawn.png");
		}
		imageView = new ImageView(image);
		imageView.setX(x * 50-2);
		imageView.setY(y* 50-2);
		// TODO Auto-generated constructor stub
	}



 
	@Override
	protected void calcMoves() {
		canMoveTo.clear();
		locationIndex = Tile.tiles.indexOf(location);
		x = locationIndex / 8;
		y = locationIndex % 8;
		if(isBlack) {
//			if(					Tile.tiles.get(	Tile.tiles.indexOf(location)+1 ).currentlyHeld == null) {
//				
//			}
			if(Tile.tiles.indexOf(location)+1<Tile.tiles.size() && Tile.tiles.get(Tile.tiles.indexOf(location)+1).currentlyHeld == null) 
				canMoveTo.add(Tile.tiles.get(Tile.tiles.indexOf(location)+1));
			//bottom right
			if(((x < 7 && y < 7)&& Tile.tiles.get(locationIndex + 9).currentlyHeld != null)&& Tile.tiles.get(locationIndex + 9).currentlyHeld.isBlack != this.isBlack) {
				canMoveTo.add(Tile.tiles.get(Tile.tiles.indexOf(location) + 9));
			}
			//bottom left
			if(((x > 0 && y < 7)&& Tile.tiles.get(locationIndex - 7).currentlyHeld != null)&& Tile.tiles.get(locationIndex - 7).currentlyHeld.isBlack != this.isBlack) {
				canMoveTo.add(Tile.tiles.get(Tile.tiles.indexOf(location) - 7));
			}
			if(!hasMoved) 
				if(Tile.tiles.indexOf(location)+2<Tile.tiles.size() && Tile.tiles.get(Tile.tiles.indexOf(location)+2).currentlyHeld == null)
					canMoveTo.add(Tile.tiles.get(Tile.tiles.indexOf(location)+2));
		}
		else {
			if(Tile.tiles.indexOf(location)-1<Tile.tiles.size() && Tile.tiles.get(Tile.tiles.indexOf(location)-1).currentlyHeld == null)
				canMoveTo.add(Tile.tiles.get(Tile.tiles.indexOf(location)-1));
			if(!hasMoved) 
				if(Tile.tiles.indexOf(location)-2<Tile.tiles.size() && Tile.tiles.get(Tile.tiles.indexOf(location)-2).currentlyHeld == null)
					canMoveTo.add(Tile.tiles.get(Tile.tiles.indexOf(location)-2));
		}
		// TODO Auto-generated method stub

	}
//	public void hasMoved() {
//		hasMoved = true;
//	}

}
