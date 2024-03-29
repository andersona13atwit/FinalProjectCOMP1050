package application;
	


import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;



public class Main extends Application {
	int times = 0;
	@Override
	public void start(Stage primaryStage) {
		try {
			
			
			// I kept this root with fxmlloader because I'm not sure what it does and I'm not sure if we're using scenebuilder
			// Group root = (Group)FXMLLoader.load(getClass().getResource("Sample.fxml"));
			
						
			Group root = new Group();
			Grid grid = new Grid(8,8, root);
			Tile.setGrid(grid);
			grid.draw();
			grid.gridpieces();
			Scene scene = new Scene(root,grid.rows*(grid.getTile(0, 0).width),grid.cols*(grid.getTile(0, 0).height));
			scene.setFill(Color.BLANCHEDALMOND);
//			grid.tiles[4][4].currentlyHeld = new Rook(grid.tiles[4][4], true);
//			root.getChildren().add(grid.tiles[4][4].currentlyHeld.imageView);
			primaryStage.setTitle("Chess!");
			primaryStage.getIcons().add(new Image("whitepawn.png"));
			
			//root.getChildren().remove(tiles[5][5]currentlyHeld.imageView);
			
			// website for pngs	https://commons.wikimedia.org/wiki/Category:PNG_chess_pieces/Standard_transparent
			
			
			
			
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
//		myGrid.gridToConsole();
//		myGrid.draw();
		
	}
}
