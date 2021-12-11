package application;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Knight extends Piece {
	

	
	

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
		// TODO Auto-generated method stub

	}

}
