package application;

public class Pawn extends Piece {
	public boolean hasMoved = false;

	public Pawn(Tile location, boolean isBlack) {
		this.location = location;
		this.isBlack = isBlack;
		calcMoves();
	}
	
	@Override
	public int move() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void update() {
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
		if(!hasMoved) {
			
		}
		// TODO Auto-generated method stub

	}

}
