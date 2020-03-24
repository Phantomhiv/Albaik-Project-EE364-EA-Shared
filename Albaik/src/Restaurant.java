
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Restaurant extends Application// need to add unimplemented method
{
	Button button;
	
	public static void main(String[] args)
	{
		launch(args);
	}
	@Override 
	public void start(Stage primaryStage) throws Exception//main window
	{
		primaryStage.setTitle("Welcom to BBQ");
		
		button = new Button();
		button.setText("Click me");
		
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		
		Scene scene = new Scene(layout, 300,250);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
}
