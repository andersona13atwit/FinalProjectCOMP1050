package application;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class King extends Piece {
	int temp;
	int x2;
	int y2;
	King(Tile location, boolean isBlack) {
		super(location, isBlack);
		if(isBlack) {
			image = new Image("blackking.png");
		}
		else {
			image = new Image("whiteking.png");
		}
		imageView = new ImageView(image);
		imageView.setX(x * 50-2);
		imageView.setY(y* 50-2);
		// TODO Auto-generated constructor stub
	}



	@Override
	protected void calcMoves() {
		// TODO Auto-generated method stub
		canMoveTo.clear();
		temp = Tile.tiles.indexOf(location);
		x2 = temp / 8;
		y2 = temp % 8;
		//right
		if(x2 < 7 && (Tile.tiles.get(temp + 8).currentlyHeld == null || Tile.tiles.get(temp + 8).currentlyHeld.isBlack != this.isBlack)) {
			canMoveTo.add(Tile.tiles.get(temp + 8));
		}
		//rd
		if(x2 < 7 & y2 < 7 && (Tile.tiles.get(temp + 9).currentlyHeld == null || Tile.tiles.get(temp + 9).currentlyHeld.isBlack != this.isBlack)) {
			canMoveTo.add(Tile.tiles.get(temp + 9));
		}
		//ru
		if(x2 < 7 & y2 > 0 && (Tile.tiles.get(temp + 7).currentlyHeld == null || Tile.tiles.get(temp + 7).currentlyHeld.isBlack != this.isBlack)) {
			canMoveTo.add(Tile.tiles.get(temp + 7));
		}
		//up
		if(y2 > 0 && (Tile.tiles.get(temp - 1).currentlyHeld == null || Tile.tiles.get(temp - 1).currentlyHeld.isBlack != this.isBlack)) {
			canMoveTo.add(Tile.tiles.get(temp - 1));
		}
		//lu
		if(x2 > 0 & y2 > 0 && (Tile.tiles.get(temp - 9).currentlyHeld == null || Tile.tiles.get(temp - 9).currentlyHeld.isBlack != this.isBlack)) {
			canMoveTo.add(Tile.tiles.get(temp - 9));
		}
		//l
		if(x2 > 0 && (Tile.tiles.get(temp - 8).currentlyHeld == null || Tile.tiles.get(temp - 8).currentlyHeld.isBlack != this.isBlack)) {
			canMoveTo.add(Tile.tiles.get(temp - 8));
		}
		///d
		if(x2 > 0 & y2 < 7 && (Tile.tiles.get(temp - 7).currentlyHeld == null || Tile.tiles.get(temp - 7).currentlyHeld.isBlack != this.isBlack)) {
			canMoveTo.add(Tile.tiles.get(temp - 7));
		}
		//down
		if(y2 < 7 && (Tile.tiles.get(temp + 1).currentlyHeld == null || Tile.tiles.get(temp + 1).currentlyHeld.isBlack != this.isBlack)) {
			canMoveTo.add(Tile.tiles.get(temp + 1));
		}

	}

}
