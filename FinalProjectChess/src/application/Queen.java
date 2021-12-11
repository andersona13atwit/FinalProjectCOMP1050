package application;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Queen extends Piece {
	int temp;
	Queen(Tile location, boolean isBlack) {
		super(location, isBlack);
		if(isBlack) {
			image = new Image("blackqueen.png");
		}
		else {
			image = new Image("whitequeen.png");
		}
		imageView = new ImageView(image);
		imageView.setX(x * 50-2);
		imageView.setY(y* 50-2);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void calcMoves() {
		canMoveTo.clear();
		temp = Tile.tiles.indexOf(location);
		for(int i = 0; i < 64;i++) {
			if ((i % 8 == temp % 8)& i != temp) {
				canMoveTo.add(Tile.tiles.get(i));
			}
		}
		
		
		
		// TODO Auto-generated method stub

	}

}
