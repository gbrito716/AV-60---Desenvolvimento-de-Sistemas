package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	
	private static Stage stage; 
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		stage = primaryStage;
		mudarCena("/gui/Cena01.fxml");
		stage.setTitle("AV60 - Projeto Javafx");
		stage.show();
	}
		
		public static void mudarCena(String fxmlPatch) {
		try {
			Parent root = FXMLLoader.load(Main.class.getResource(fxmlPatch));
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
