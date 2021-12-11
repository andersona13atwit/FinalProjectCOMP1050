package application;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
public class Rook extends Piece {
	int temp;
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




	@Override
	protected void calcMoves() {
		// TODO Auto-generated method stub
		canMoveTo.clear();
		temp = Tile.tiles.indexOf(location);
		for(int i = 0; i < 64;i++) {
			if ((i % 8 == temp % 8)& i != temp || i / 8 == temp / 8 & i != temp) {
				if(Tile.tiles.get(i).currentlyHeld == null) {
					canMoveTo.add(Tile.tiles.get(i));
				}
			}
		}
			
		
		
		
		
		
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
