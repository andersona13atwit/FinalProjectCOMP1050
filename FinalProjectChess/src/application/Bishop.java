package application;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Bishop extends Piece {
	int temp;
	int x;
	int y;
	int num;
	Bishop(Tile location,boolean isBlack) {
		super(location, isBlack);
		calcMoves();
		if(isBlack) {
			image = new Image("blackbishop.png");
		}
		else {
			image = new Image("whitebishop.png");
		}
		imageView = new ImageView(image);
		imageView.setX(x * 50-2);
		imageView.setY(y* 50-2);
		setHandlerForImageView(Tile.grid);
		// TODO Auto-generated constructor stub
	}


	@Override
	protected void calcMoves() {
		// TODO Auto-generated method stub
		canMoveTo.clear();
		temp = Tile.tiles.indexOf(location);
		x = temp / 8;
		y = temp % 8;
		
		
		
		//up right;
		num = y;
		if(7 - x <= y)
			num = 7 - x;
		
		
		for(int i = 1; i <= num;i++) {
			if (Tile.tiles.get(temp + (i*7)).currentlyHeld == null) {
				canMoveTo.add(Tile.tiles.get(temp +(i *7)));

			}
			else if(Tile.tiles.get(temp + (i*7)).currentlyHeld.isBlack != this.isBlack){
				canMoveTo.add(Tile.tiles.get(temp +(i *7)));
			}
			if(Tile.tiles.get(temp + (i*7)).getPiece() != null ) {
				break;
			}
		}
		//down left;
		num = x;
		if(7 - y <= x)
			num = 7 - y;
		
		
		for(int i = 1; i <= num;i++) {
			if (Tile.tiles.get(temp - (i*7)).currentlyHeld == null) {
				canMoveTo.add(Tile.tiles.get(temp -(i *7)));

			}
			else if(Tile.tiles.get(temp - (i*7)).currentlyHeld.isBlack != this.isBlack){
				canMoveTo.add(Tile.tiles.get(temp -(i *7)));
			}
			if(Tile.tiles.get(temp - (i*7)).getPiece() != null ) {
				break;
			}
		}
		
		//up left;
		num = x;
		if(y <= x)
			num = y;
		
		
		for(int i = 1; i <= num;i++) {
			if (Tile.tiles.get(temp - (i*9)).currentlyHeld == null) {
				canMoveTo.add(Tile.tiles.get(temp -(i *9)));

			}
			else if(Tile.tiles.get(temp - (i*9)).currentlyHeld.isBlack != this.isBlack){
				canMoveTo.add(Tile.tiles.get(temp -(i *9)));
			}
			if(Tile.tiles.get(temp - (i*9)).getPiece() != null ) {
				break;
			}
		}
		
		//down right;
		num = 7 - x;
		if(7 - y <= x)
			num = 7 - y;
		
		
		for(int i = 1; i <= num;i++) {
			if ((temp + (i*9)) < 64 && Tile.tiles.get(temp + (i*9)).currentlyHeld == null) {
				canMoveTo.add(Tile.tiles.get(temp +(i *9)));

			}
			else if((temp + (i*9)) < 64 && Tile.tiles.get(temp + (i*9)).currentlyHeld.isBlack != this.isBlack){
				canMoveTo.add(Tile.tiles.get(temp +(i *9)));
			}
			if((temp + (i*9)) < 64 && Tile.tiles.get(temp + (i*9)).getPiece() != null ) {
				break;
			}
		}

	}

}
