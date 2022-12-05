package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			Parent parent = FXMLLoader.load(getClass().getResource("Login.fxml"));
			
			Scene scene = new Scene(parent);
			
			primaryStage.setScene(scene);
			
			primaryStage.setTitle("User Login");
			
			primaryStage.show();
			
			
					
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
