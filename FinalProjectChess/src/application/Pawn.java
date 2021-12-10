package application;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
public class Pawn extends Piece {
	public boolean hasMoved = false;

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
		if(isBlack) {
			canMoveTo.add(Tile.tiles.get(27));
//			canMoveTo.add(location);
		}
		// TODO Auto-generated method stub

	}

}
