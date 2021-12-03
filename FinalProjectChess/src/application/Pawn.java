package application;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;



public class Pawn extends Piece {
	
	public Image image;
	public ImageView imageView;
	
	
	
	Pawn(int x, int y, boolean isBlack) {
		super(x, y, isBlack);

		
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

	public Tile location;
	public Tile[] canMoveTo;
	public boolean isSelected;

	

	

	@Override
	public int move() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void update() {
		imageView.setX(x * 50-2);
		imageView.setY(y* 50-2);
		// TODO Auto-generated method stub

	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void toggleSelected() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void calcMoves() {
		// TODO Auto-generated method stub

	}

}
