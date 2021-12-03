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
			
			
			// This grid bugs out when an even num of columns is used
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
			
			
			
			
			
			
			//test for drawing pieces
//			Image bp = new Image("blackpawn.png");
//			ImageView bpView = new ImageView(bp);
//			bpView.setX(295);
//			bpView.setY(295);
//			root.getChildren().add(bpView);
//			Pawn test = new Pawn(5,6,true);
//			root.getChildren().add(test.imageView);
			
			
			
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
