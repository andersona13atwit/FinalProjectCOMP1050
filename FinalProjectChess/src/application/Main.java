package application;
	
import java.util.ArrayList;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
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
//			Group root = (Group)FXMLLoader.load(getClass().getResource("Sample.fxml"));
			
			
			// Right not all of this is just for testing. Feel free to change it how you see fit if you also want to experiment
			Rectangle rect = new Rectangle(5,5,10,10);
			// {new Rectangle(5,5,10,10), new Rectangle(20,20,10,10)}
			Grid grid = new Grid(5,5);
			ArrayList<Rectangle> newRects = grid.draw();
			newRects.add(rect);
			newRects.add(new Rectangle(20,20,10,10));

			Rectangle[] rects = new Rectangle[newRects.size()];
			for(int i = 0; i < newRects.size(); i++) {
				rects[i] = newRects.get(i);
				rects[i].setFill(Color.RED);
			}
			
			
			// Everything here in reference to temp exists just for testing
			Rectangle temp = new Rectangle(20,20,300,300);
			temp.setFill(Color.GREEN);
			temp.setOnMouseEntered(new EventHandler<Event>() {
				@Override
				public void handle(Event event) {
					// TODO Auto-generated method stub
					times++;
					System.out.println("I've been clicked " + times + "!!!");	
				}
				
			});
			
			Group root = new Group(temp);
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
				@Override
				public void handle(KeyEvent event) {
					// TODO Auto-generated method stub
					System.out.println(event.getCode());
					if(event.getCode() == KeyCode.DOWN) {
						temp.setX(temp.getX()-5);
					}
				}
				
			});
			
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
