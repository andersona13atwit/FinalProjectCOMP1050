package application;

public class King extends Piece {
	King(Tile location, boolean isBlack) {
		super(location, isBlack);
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
