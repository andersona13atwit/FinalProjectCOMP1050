package application;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Knight extends Piece {
	int locationIndex;
	int x2;
	int y2;

	
	

	Knight(Tile location, boolean isBlack) {
		super(location, isBlack);
		if(isBlack) {
			image = new Image("blackknight.png");
		}
		else {
			image = new Image("whiteknight.png");
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
		x2 = locationIndex / 8;
		y2 = locationIndex % 8;
		// TODO Auto-generated method stub
		//fr
		if(x2 < 7 && y2 > 1) {
			if((Tile.tiles2d[x2 + 1][y2 - 2].currentlyHeld == null) || Tile.tiles2d[x2 + 1][y2 - 2].currentlyHeld.isBlack != this.isBlack) {
				canMoveTo.add(Tile.tiles2d[x2 + 1][y2 - 2]);
			}
		}
		//rightup
		if(x2 < 6 && y2 > 0) {
			if((Tile.tiles2d[x2 + 2][y2 - 1].currentlyHeld == null) || Tile.tiles2d[x2 + 2][y2 - 1].currentlyHeld.isBlack != this.isBlack) {
				canMoveTo.add(Tile.tiles2d[x2 + 2][y2 - 1]);
			}
		}
		//left up
		if(x2 > 1  && y2 > 0) {
			if((Tile.tiles2d[x2 - 2][y2 - 1].currentlyHeld == null) || Tile.tiles2d[x2 - 2][y2 - 1].currentlyHeld.isBlack != this.isBlack) {
				canMoveTo.add(Tile.tiles2d[x2 - 2][y2 - 1]);
			}
		}
		//up left
		if(x2 > 0 && y2 > 1) {
			if((Tile.tiles2d[x2 - 1][y2 - 2].currentlyHeld == null) || Tile.tiles2d[x2 - 1][y2 - 2].currentlyHeld.isBlack != this.isBlack) {
				canMoveTo.add(Tile.tiles2d[x2 - 1][y2 - 2]);
			}
		}
		//down left
		if(x2 > 0 && y2 < 6) {
			if((Tile.tiles2d[x2 - 1][y2 + 2].currentlyHeld == null) || Tile.tiles2d[x2 - 1][y2 + 2].currentlyHeld.isBlack != this.isBlack) {
				canMoveTo.add(Tile.tiles2d[x2 - 1][y2 + 2]);
			}
		}
		//left down
		if(x2 > 1 && y2 < 7) {
			if((Tile.tiles2d[x2 - 2][y2 + 1].currentlyHeld == null) || Tile.tiles2d[x2 - 2][y2 + 1].currentlyHeld.isBlack != this.isBlack) {
				canMoveTo.add(Tile.tiles2d[x2 - 2][y2 + 1]);
			}
		}
		//right down
		if(x2 < 6 && y2 < 7) {
			if((Tile.tiles2d[x2 + 2][y2 + 1].currentlyHeld == null) || Tile.tiles2d[x2 + 2][y2 + 1].currentlyHeld.isBlack != this.isBlack) {
				canMoveTo.add(Tile.tiles2d[x2 + 2][y2 + 1]);
			}
		}
		//down right
		if(x2 < 7 && y2 < 6) {
			if((Tile.tiles2d[x2 + 1][y2 + 2].currentlyHeld == null) || Tile.tiles2d[x2 + 1][y2 + 2].currentlyHeld.isBlack != this.isBlack) {
				canMoveTo.add(Tile.tiles2d[x2 + 1][y2 + 2]);
			}
		}
	}

}
