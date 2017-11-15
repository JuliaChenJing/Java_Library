package gui.javaFX.stringUtility;

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
import java.util.ArrayList;

public class StringApplication  extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("String Utility");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        
        //BUTTON
        Button btn0 = new Button("Count Letters");
        HBox hbBtn0 = new HBox(10);
        hbBtn0.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn0.getChildren().add(btn0);
        grid.add(hbBtn0, 1, 1);
        
        Button btn1 = new Button("Reverse Letters");
        HBox hbBtn1 = new HBox(10);
        hbBtn1.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn1.getChildren().add(btn1);
        grid.add(hbBtn1, 1, 3);
        
        Button btn2 = new Button("Remove Duplicates");
        HBox hbBtn2 = new HBox(10);
        hbBtn2.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn2.getChildren().add(btn2);
        grid.add(hbBtn2, 1, 5);
        
 
        //LALBLE
        Label input= new Label("input");
        grid.add(input, 2, 1);
        
        Label output = new Label("output");
        grid.add(output, 2, 3);
        
      
  
        //TEXTField
      
        TextField inputTextField = new TextField();
        //nameTextField.setPrefColumnCount(10);
        //nameTextField.setPrefWidth(30);
        grid.add(inputTextField, 2, 2);
        
        TextField outputTextField = new TextField();
        grid.add(outputTextField, 2, 4);

        
  
    
        
        
        btn0.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				
		    outputTextField.setText(String.valueOf(inputTextField.getText().length()));
		
			}
		});
		
        
        btn1.setOnAction(new EventHandler<ActionEvent>() {
  			@Override
  			public void handle(ActionEvent event) {
  				
  		    outputTextField.setText(ReverseString(inputTextField.getText()));
  		
  			}
  		});
        
        btn2.setOnAction(new EventHandler<ActionEvent>() {
  			@Override
  			public void handle(ActionEvent event) {
  				
  				outputTextField.setText(RemoveDuplicates(inputTextField.getText()));
  		
  			}
  		});
        
        //Scene scene = new Scene(grid, 300, 200);
        Scene scene = new Scene(grid);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public String ReverseString(String s) {

		String re = new String();
		for (int i = s.length() - 1; i >= 0; i--)
			re += s.charAt(i);
		return re;
	}

	 public String RemoveDuplicates(String s) {

		String re = new String();
		String re2=new String();
		ArrayList list = new ArrayList();
		for (int i = 0; i < s.length(); i++)

		{
			if (!list.contains(s.charAt(i)))
				list.add(s.charAt(i));
		}
		re += list.toString();
		for(int i=0;i<re.length();i++)
			if(re.charAt(i)!=','&&re.charAt(i)!='['&&re.charAt(i)!=']'&&re.charAt(i)!=' ')
				re2+=re.charAt(i);
		return re2;
	}


}
