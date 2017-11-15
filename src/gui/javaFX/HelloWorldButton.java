package gui.javaFX;

import java.util.List;

import javafx.application.Application;
//The entry point for a JavaFX application is always a user-defined subclass of the abstract class      
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

//1 â€¢Constructs an instance of the specified Application class
public class HelloWorldButton extends Application {
	// The entry point for a JavaFX application is always a user-defined
	// subclass of the abstract class

	String username;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	// 2. â€¢Calls the init() method (for initializing; typical use: read
	// command line args,
	// The init and stop methods have concrete implementations that do nothing
	// by default
	public void init() {
		List<String> cmdlineParams = getParameters().getRaw();
		if (cmdlineParams.size() > 0) {
			username = cmdlineParams.get(0);
		}
	}

	@Override
	// 3. â€¢Calls the start(javafx.stage.Stage) method (abstract)
	// The start method is abstract and must be overridden.
	public void start(Stage primaryStage) {// stage is created
		// A JavaFX application defines the user interface container by means of
		// a stage æ•´ä¸ªçª—å�£and a sceneé™¤äº†è¾¹æ¡†ï¼Œæ˜¾ç¤ºå†…å®¹çš„åœ°æ–¹
		primaryStage.setTitle("Hello!");
		Button btn = new Button();
		btn.setText("Say 'Hello'");
		btn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Hello " + (username != null ? username : "World") + "!");
			}
		});
		StackPane root = new StackPane();
		root.getChildren().add(btn);
		// primaryStage.setScene(new Scene(root));
		primaryStage.setScene(new Scene(root, 300, 250));// Scene is created and
															// set
		primaryStage.show();
	}

	@Override
	// 4. â€¢Waits for the application to finish, which happens when either of
	// the following occurs:
	// 5. â€¢Calls the stop() method (typical use: clean up connections to
	// resources)
	// The init and stop methods have concrete implementations that do nothing
	// by default
	public void stop() {
		// clean up resources
	}
}