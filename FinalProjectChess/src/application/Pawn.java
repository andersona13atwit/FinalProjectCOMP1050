package application;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
public class Pawn extends Piece {
//	public boolean hasMoved = false;

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
		if(isBlack) {
			if(Tile.tiles.indexOf(location)+1<Tile.tiles.size() && Tile.tiles.get(Tile.tiles.indexOf(location)).currentlyHeld == null) 
				canMoveTo.add(Tile.tiles.get(Tile.tiles.indexOf(location)+1));
			if(!hasMoved) 
				if(Tile.tiles.indexOf(location)+2<Tile.tiles.size())
					canMoveTo.add(Tile.tiles.get(Tile.tiles.indexOf(location)+2));
		}
		else {
			if(Tile.tiles.indexOf(location)-1<Tile.tiles.size())
				canMoveTo.add(Tile.tiles.get(Tile.tiles.indexOf(location)-1));
			if(!hasMoved) 
				if(Tile.tiles.indexOf(location)-2<Tile.tiles.size())
					canMoveTo.add(Tile.tiles.get(Tile.tiles.indexOf(location)-2));
		}
		// TODO Auto-generated method stub

	}
//	public void hasMoved() {
//		hasMoved = true;
//	}

}
