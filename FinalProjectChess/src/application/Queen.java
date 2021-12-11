package application;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Queen extends Piece {
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
		// TODO Auto-generated method stub

	}

}
