package application;

import java.io.File;
import java.util.ArrayList;

//import javafx.scene.paint.Color;

import javafx.scene.shape.Rectangle;

public class Grid {
	public int rows, cols;
	public Tile[][] tiles;
	
	// Storage would be if we implement saving
	public File storage;
	
	public Grid(int rows, int cols, File storage) {
		this.rows = rows;
		this.cols = cols;
		this.storage = storage;
		this.gridFill();
	}
	public Grid(int rows, int cols) {
		this.rows = rows;
		this.cols = cols;
		this.gridFill();
	}
	public Grid() {
		this.rows = 0;
		this.cols = 0;
		this.gridFill();
	}
	private void gridFill() {
		this.tiles = new Tile[rows][cols];
		boolean isBlack = true;
		for(int i = 0; i < this.rows; i++) {
			if(i % 2 == 0) {
				isBlack = true;
			}
			else {
				isBlack = false;
			}
			for(int k = 0; k < this.cols; k++) {
				if(isBlack) {
					tiles[i][k] = new Tile(i,k, true);
					isBlack = false;
				}
				else {
					tiles[i][k] = new Tile(i,k, false);
					isBlack = true;
				}
				
			}
		}
		gridpieces();
	}
	
	
	public void gridpieces() {
		
		
		//black pawns
		for(int i = 0;i < 8;i++){
			tiles[1][i].setPiece(new Pawn(tiles[1][i],true));
		}
		//black rook;
		tiles[0][0].setPiece(new Pawn(tiles[0][0],true));
		tiles[0][7].setPiece(new Pawn(tiles[0][7],true));
		//black knight
		tiles[0][1].setPiece(new Pawn(tiles[0][1],true));
		tiles[0][6].setPiece(new Pawn(tiles[0][6],true));
		//black bishop
		tiles[0][2].setPiece(new Pawn(tiles[0][2],true));
		tiles[0][5].setPiece(new Pawn(tiles[0][5],true));
		//black queen
		tiles[0][4].setPiece(new Pawn(tiles[0][4],true));
		
		//black king
		tiles[0][3].setPiece(new Pawn(tiles[0][3],true));
		
		
		
		
		//white pawns
		for(int i = 0;i < 8;i++){
			tiles[6][i].setPiece(new Pawn(tiles[6][i],false));
		}
		//white rook
		tiles[7][0].setPiece(new Pawn(tiles[7][0],true));
		tiles[7][7].setPiece(new Pawn(tiles[7][7],true));
		//white knight
		tiles[7][1].setPiece(new Pawn(tiles[7][1],true));
		tiles[7][6].setPiece(new Pawn(tiles[7][6],true));
		//white bishop
		tiles[7][2].setPiece(new Pawn(tiles[7][2],true));
		tiles[7][5].setPiece(new Pawn(tiles[7][5],true));
		//white queen
		tiles[7][4].setPiece(new Pawn(tiles[7][4],true));
		//white king
		tiles[7][3].setPiece(new Pawn(tiles[7][3],true) );
	}
	
	
	
	
	
	public void gridToConsole() {
		for(int i = 0; i < this.rows; i++) {
			for(int k = 0; k < this.cols; k++) {
//				System.out.print(tiles[i][k]+" ");
			}
//			System.out.println();
		}
	}
	
	public Tile getTile(int row, int col) {
		return tiles[row][col];
	}
	
	/**
	 * This method needs to be passed a graphics object. <br>
	 * The purpose is for less clutter in the main program <br>
	 * and so any grid can know its own instructions
	 * 
	 */
	// Currently I'm attempting to have it return an array of rectangles which will be drawn by the main function
	public ArrayList<Rectangle> draw() {
		ArrayList<Rectangle> rects = new ArrayList<>();
		for(int i = 0; i < this.rows; i++) {
			for(int k = 0; k < this.cols; k++) {
				rects.add(tiles[i][k].draw());
			}
		}
		return rects;
	}
}
