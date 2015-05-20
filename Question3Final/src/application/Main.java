package application;
	
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	 @Override
	    public void start(Stage stage) throws Exception {
	       Parent root = FXMLLoader.load(getClass().getResource("MortgageInterface.fxml"));
	    
	        Scene scene = new Scene(root, 300, 275);
	    
	        stage.setTitle("Mortgage Estimator");
	        stage.setScene(scene);
	        stage.show();
	    }
	
	public static void main(String[] args) {

		launch(args);
	}
}
