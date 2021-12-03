package application;

import java.io.File;
import java.util.ArrayList;

import javafx.scene.Group;

//import javafx.scene.paint.Color;

import javafx.scene.shape.Rectangle;

public class Grid {
	public int rows, cols;
	public Tile[][] tiles;
	public Group root;
	
	// Storage would be if we implement saving
	public File storage;
	
	public Grid(int rows, int cols, File storage) {
		this.rows = rows;
		this.cols = cols;
		this.storage = storage;
		this.gridFill();
	}
	public Grid(int rows, int cols, Group root) {
		this.rows = rows;
		this.cols = cols;
		this.root = root;
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
	}
	
	
	public void gridpieces() {
		
		
		//black pawns
		
		for(int i = 0;i < 8;i++){
			tiles[i][1].setPiece(new Pawn(tiles[i][1],true));
			root.getChildren().add((tiles[i][1].getPiece()).imageView);
		}
		//black rook;
		tiles[0][0].setPiece(new Rook(tiles[0][0],true));
		tiles[7][0].setPiece(new Rook(tiles[7][0],true));
		
		root.getChildren().add((tiles[0][0].getPiece()).imageView);
		root.getChildren().add((tiles[7][0].getPiece()).imageView);
		//black knight
		tiles[1][0].setPiece(new Pawn(tiles[1][0],true));
		tiles[6][0].setPiece(new Pawn(tiles[6][0],true));
		//black bishop
		tiles[2][0].setPiece(new Pawn(tiles[2][0],true));
		tiles[5][0].setPiece(new Pawn(tiles[5][0],true));
		//black queen
		tiles[4][0].setPiece(new Pawn(tiles[4][0],true));
		
		//black king
		tiles[3][0].setPiece(new Pawn(tiles[3][0],true));
		
		
		
		
		//white pawns
		for(int i = 0;i < 8;i++){
			tiles[i][6].setPiece(new Pawn(tiles[i][6],false));
			root.getChildren().add((tiles[i][6].getPiece()).imageView);
		}
		//white rook
		tiles[0][7].setPiece(new Pawn(tiles[0][7],true));
		tiles[7][7].setPiece(new Pawn(tiles[7][7],true));
		//white knight
		tiles[1][7].setPiece(new Pawn(tiles[1][7],true));
		tiles[6][7].setPiece(new Pawn(tiles[6][7],true));
		//white bishop
		tiles[2][7].setPiece(new Pawn(tiles[2][7],true));
		tiles[5][7].setPiece(new Pawn(tiles[5][7],true));
		//white queen
		tiles[4][7].setPiece(new Pawn(tiles[4][7],true));
		//white king
		tiles[3][7].setPiece(new Pawn(tiles[3][7],true) );
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
				root.getChildren().add(tiles[i][k].draw());
			}
		}
		return rects;
	}
}
