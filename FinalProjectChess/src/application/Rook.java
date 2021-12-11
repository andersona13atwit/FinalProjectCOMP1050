package application;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
public class Rook extends Piece {
	int temp;
	int x;
	int y;
	int num;
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
		
		
		
		
		//right
		num = 7 - x;
		for(int i = 1; i <= num; i++) {
			if (Tile.tiles.get(temp + (i*8)).currentlyHeld == null) {
				canMoveTo.add(Tile.tiles.get(temp +(i *8)));

			}
			else if(Tile.tiles.get(temp + (i*8)).currentlyHeld.isBlack != this.isBlack){
				canMoveTo.add(Tile.tiles.get(temp +(i *8)));
			}
			if(Tile.tiles.get(temp + (i*8)).getPiece() != null ) {
				break;
			}
		}
		//left
		num = x;
		for(int i = 1; i <= num; i++) {
			if (Tile.tiles.get(temp - (i*8)).currentlyHeld == null) {
				canMoveTo.add(Tile.tiles.get(temp -(i *8)));

			}
			else if(Tile.tiles.get(temp - (i*8)).currentlyHeld.isBlack != this.isBlack){
				canMoveTo.add(Tile.tiles.get(temp -(i *8)));
			}
			if(Tile.tiles.get(temp - (i*8)).getPiece() != null ) {
				break;
			}
		}
		//up
		num = y;
		for(int i = 1; i <= num; i++) {
			if (Tile.tiles.get(temp - (i)).currentlyHeld == null) {
				canMoveTo.add(Tile.tiles.get(temp -(i)));

			}
			else if(Tile.tiles.get(temp - (i)).currentlyHeld.isBlack != this.isBlack){
				canMoveTo.add(Tile.tiles.get(temp -(i)));
			}
			if(Tile.tiles.get(temp - (i)).getPiece() != null ) {
				break;
			}
		}
		
		//down
		num = 7 - y;
		for(int i = 1; i <= num; i++) {
			if (Tile.tiles.get(temp + (i)).currentlyHeld == null) {
				canMoveTo.add(Tile.tiles.get(temp +(i)));

			}
			else if(Tile.tiles.get(temp + (i)).currentlyHeld.isBlack != this.isBlack){
				canMoveTo.add(Tile.tiles.get(temp +(i)));
			}
			if(Tile.tiles.get(temp + (i)).getPiece() != null ) {
				break;
			}
		}
		
		
		
		
		
		
//		for(int i = 0; i < 64;i++) {
//			if ((i % 8 == temp % 8)& i != temp || i / 8 == temp / 8 & i != temp) {
//				if(Tile.tiles.get(i).currentlyHeld == null || Tile.tiles.get(i).currentlyHeld.isBlack != this.isBlack) {
//					canMoveTo.add(Tile.tiles.get(i));
//				}
//			}
//		}
			
		
		
		
		
		
//		for(int i = 0; i < Tile.tiles.size(); i+=8) {
//			if(Tile.tiles.indexOf(location)+i<Tile.tiles.size() && Tile.tiles.get(Tile.tiles.indexOf(location)+i).currentlyHeld == null) {
//				canMoveTo.add(Tile.tiles.get(Tile.tiles.indexOf(location)+i));
//			}
//		}
//		for(int i = Tile.tiles.size()-1; i > 0; i-=8) {
//			if(Tile.tiles.indexOf(location)-i>0 ) {
//				canMoveTo.add(Tile.tiles.get(Tile.tiles.indexOf(location)-i));
//			}
//		}
	}

}
