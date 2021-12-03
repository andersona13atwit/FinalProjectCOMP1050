package application;
	
import java.io.File;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	int times = 0;
	@Override
	public void start(Stage primaryStage) {
		try {
			
			
			// I kept this root with fxmlloader because I'm not sure what it does and I'm not sure if we're using scenebuilder
			// Group root = (Group)FXMLLoader.load(getClass().getResource("Sample.fxml"));
			
			
			Grid grid = new Grid(8,8);
			ArrayList<Rectangle> newRects = grid.draw();
			Rectangle[] rects = new Rectangle[newRects.size()];
			for(int i = 0; i < rects.length; i++) {
				rects[i] = newRects.get(i);
			}
			
			Group root = new Group(rects);
			Scene scene = new Scene(root,grid.rows*(grid.getTile(0, 0).width),grid.cols*(grid.getTile(0, 0).height));
//			Scene scene = new Scene(root, 1000,1000);
			scene.setFill(Color.BLANCHEDALMOND);
			primaryStage.setTitle("Chess!");
//			primaryStage.getIcons().add(new Image(".\\\\assets\\\\portablejim-Chess-tile-Rook-1.png"));
//			primaryStage.getIcons().add(new Image("blackpawn.png"));
//  		website for pngs	https://commons.wikimedia.org/wiki/Category:PNG_chess_pieces/Standard_transparent
			
			//setup
//			Pawn bpawn0 = new Pawn(0,6,true);
//			Pawn bpawn1 = new Pawn(1,6,true);
//			Pawn bpawn2 = new Pawn(2,6,true);
//			Pawn bpawn3 = new Pawn(3,6,true);
//			Pawn bpawn4 = new Pawn(4,6,true);
//			Pawn bpawn5 = new Pawn(5,6,true);
//			Pawn bpawn6 = new Pawn(6,6,true);
//			Pawn bpawn7 = new Pawn(7,6,true);
//			
//			
//			Pawn wpawn0 = new Pawn(0,1,false);
//			Pawn wpawn1 = new Pawn(1,1,false);
//			Pawn wpawn2 = new Pawn(2,1,false);
//			Pawn wpawn3 = new Pawn(3,1,false);
//			Pawn wpawn4 = new Pawn(4,1,false);
//			Pawn wpawn5 = new Pawn(5,1,false);
//			Pawn wpawn6 = new Pawn(6,1,false);
//			Pawn wpawn7 = new Pawn(7,1,false);
//			
//			root.getChildren().add(bpawn0.imageView);
//			root.getChildren().add(bpawn1.imageView);
//			root.getChildren().add(bpawn2.imageView);
//			root.getChildren().add(bpawn3.imageView);
//			root.getChildren().add(bpawn4.imageView);
//			root.getChildren().add(bpawn5.imageView);
//			root.getChildren().add(bpawn6.imageView);
//			root.getChildren().add(bpawn7.imageView);
//
//			

//			root.getChildren().add(wpawn0.imageView);
//			root.getChildren().add(wpawn1.imageView);
//			root.getChildren().add(wpawn2.imageView);
//			root.getChildren().add(wpawn3.imageView);
//			root.getChildren().add(wpawn4.imageView);
//			root.getChildren().add(wpawn5.imageView);
//			root.getChildren().add(wpawn6.imageView);
//			root.getChildren().add(wpawn7.imageView);
			
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void update() {
		
	}
	public static void draw() {
		
	}
	
	public static void main(String[] args) {
		launch(args);
		Grid myGrid = new Grid(7,3);
//		myGrid.gridToConsole();
//		myGrid.draw();
		
	}
}
