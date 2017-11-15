package gui.javaFX;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AddressForm extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Address Form");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

 
        //LALBLE
        Label name = new Label("Name:");
        grid.add(name, 1, 1);
        
        Label street = new Label("Street:");
        grid.add(street, 3, 1);
        
        Label city = new Label("City:");
        grid.add(city, 5, 1);
        
        Label state= new Label("State:");
        grid.add(state, 2, 3);
        
        Label Zip= new Label("Zip:");
        grid.add(Zip, 4, 3);
        
   
    
        //TEXTField
      
        TextField nameTextField = new TextField();
        //nameTextField.setPrefColumnCount(10);
        //nameTextField.setPrefWidth(30);
        grid.add(nameTextField, 1, 2);
        
        TextField streetTextField = new TextField();
        grid.add(streetTextField, 3, 2);

        
        TextField cityTextField = new TextField();
        grid.add(cityTextField, 5, 2);

        
        TextField stateTextField = new TextField();
        grid.add(stateTextField, 2, 4);

        
        TextField zipTextField = new TextField();
        grid.add(zipTextField, 4, 4);

        //BUTTON
        Button btn = new Button("Submit");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 3, 7);
        
        btn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				//System.out.print("hello");
				System.out.println(nameTextField.getText());
				System.out.println(streetTextField.getText());
				System.out.println(cityTextField.getText()+" "+stateTextField.getText()+" "+zipTextField.getText());
				
			}
		});
        
        //Scene scene = new Scene(grid, 300, 200);
        Scene scene = new Scene(grid);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
