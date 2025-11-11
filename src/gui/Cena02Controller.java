package gui;

import application.Main;
import javafx.fxml.FXML;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Cena02Controller {

	@FXML
	private Circle bolinha;
	
	@FXML
	public void iniciar() {
		bolinha.setFill(Color.BLUE);
	}
	
	@FXML
	private void mudarCena03() {
		Main.mudarCena("/gui/Cena03.fxml");
	}
}
