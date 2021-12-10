package application;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
public class Rook extends Piece {
	Rook(Tile location, boolean isBlack) {
		super(location, isBlack);
		calcMoves();
		if(isBlack) {
			image = new Image("blackrook.png");
		}
		else {
			image = new Image("whiterook.png");
		}
		imageView = new ImageView(image);
		imageView.setX(x * 50-2);
		imageView.setY(y* 50-2);
		// TODO Auto-generated constructor stub
	}

	public Tile location;
	public boolean isSelected;

	@Override
	public int move() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void draw() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void calcMoves() {
		// TODO Auto-generated method stub

	}

}
