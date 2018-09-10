import java.io.IOException;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application
{
	@Override
	public void start (Stage primaryStage)  
	{
		
		try {
			Parent root =  FXMLLoader.load(getClass().getResource("/src/view/login.fxml"));
			Scene scene = new Scene (root, 400, 400);
			scene.getStylesheets().add(getClass().getResource("/src/application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main (String[] args) 
	{
		launch(args);
	}
	
	
}
