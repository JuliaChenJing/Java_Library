package gui.javaFX.secondWindow;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FirstWindow extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	
	Text messageBar = new Text();

	Stage secondWindow;
	Stage primaryStage;
	

	private void createSecondWindow() {
		secondWindow = new SecondWindow(primaryStage);
        messageBar.setText("");
	}
	@Override

	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		
		primaryStage.setTitle("The First Windows");
		createSecondWindow();
		
		messageBar.setFill(Color.PURPLE);
		Button btn = new Button();
		btn.setText("Show second window");
		
		//Button click displays a second window
		btn.setOnAction(new EventHandler<ActionEvent>() {
			@Override public void handle(ActionEvent e) {
				messageBar.setText("");
		        secondWindow.show();  
		    }
		});
		
		Button btn2 = new Button();
		btn2.setText("Exit Application");
		
		//Button click exits the application
		btn2.setOnAction(new EventHandler<ActionEvent>() {
			@Override public void handle(ActionEvent e) {
		        Platform.exit();	        
		    }
		});
		

		messageBar.setText("Click a button");
		
		//Arrange buttons in a 2x1 grid
		GridPane grid1 = new GridPane();
		grid1.setAlignment(Pos.CENTER);
		grid1.setVgap(10); //sets vertical gap between buttons
		grid1.add(btn,0,0);
		grid1.add(btn2,0,1);
		grid1.add(messageBar, 0, 3);
		
		//create and position scene in stage
		Scene scene = new Scene(grid1, 300, 250);
		positionSceneInStage(primaryStage, scene);

		primaryStage.setScene(scene);
		
		primaryStage.show();
	}
	
	void positionSceneInStage(Stage stage, Scene scene) {
		/*Usual way to center the screen in the stage:
		Rectangle2D primScreenBounds = Screen.getPrimary().getVisualBounds();
        stage.setX((primScreenBounds.getWidth() - stage.getWidth()) / 2); 
        stage.setY((primScreenBounds.getHeight() - stage.getHeight()) / 4);
        */  
		stage.setX(200); 
		stage.setY(200); 
		
	}
	public void init() {
		System.out.println("Starting...");
	}
	public void stop() {
		System.out.println("Stopping...");
	}
}