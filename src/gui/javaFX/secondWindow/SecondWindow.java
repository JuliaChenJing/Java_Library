package gui.javaFX.secondWindow;


import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SecondWindow extends Stage {
	Stage primaryStage;
	@SuppressWarnings("serial")
	HashMap<String, Color> colorMap = new HashMap<String, Color>() {
		{
			put("White", Color.WHITE);
			put("Blue", Color.CORNFLOWERBLUE);
		}
	};
	List<String> colors = colorMap.keySet().stream().collect(Collectors.toList());
	private static final Color DEFAULT_COLOR = Color.WHITE;
	GridPane grid = new GridPane();
	ComboBox<String> changeColorCombo = new ComboBox<>(FXCollections.observableList(colors));
	
	public SecondWindow(Stage ps) {
		//加component
		primaryStage = ps;
		setTitle("Second Window");
		
		grid.setAlignment(Pos.CENTER);
		grid.setVgap(10);

		//隐藏第一个窗口
		Button secondBtn = new Button("Hide first window");
        //Hide other window, show current window
		secondBtn.setOnAction(evt -> {
			primaryStage.hide();
			show();
		});
        
		//隐藏第二个窗口
        Button thirdBtn = new Button("Show first window");
        //Hide this window, show other window
        thirdBtn.setOnAction(evt -> {
        	primaryStage.show();
			hide();
		});
        setUpCombo();
            
        //Arrange buttons in a 2x1 grid
  		grid.setAlignment(Pos.CENTER);
  		grid.setVgap(10); //sets vertical gap between buttons
  		grid.add(changeColorCombo, 0, 0);
  		GridPane.setHalignment(changeColorCombo, HPos.LEFT);
  		grid.add(secondBtn,0,2);
  		grid.add(thirdBtn,0,3);
        Scene scene = new Scene(grid,300, 250);
        positionSceneInStage(this, scene);
        setBackground(DEFAULT_COLOR);
        scene.setFill(Color.BEIGE);
		setScene(scene);
	}
	
	//设置背景
	void setBackground(Color color) {
		grid.backgroundProperty().set(new Background(new BackgroundFill(color, CornerRadii.EMPTY, Insets.EMPTY)));
	}
	
	//设置位置
	void positionSceneInStage(Stage stage, Scene scene) { 
		stage.setX(600); 
		stage.setY(200); 
	}
	
	private void setUpCombo() {
		changeColorCombo.valueProperty().addListener(new ChangeListener<String>() {
	        @Override 
	        public void changed(ObservableValue<? extends String> ov, String oldval, String newval) {
	        	Optional<String> colorFound =
	        		colors.stream().filter(s -> s.equals(newval)).findFirst();
	        	colorFound.ifPresent(c -> setBackground(colorMap.get(c)));
	        }

		});
		//set default val
		changeColorCombo.setValue(colors.get(0));
	}
}