package gui;

import application.Main;
import javafx.fxml.FXML;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Cena03Controller {

	@FXML
	private Circle bolinha;
	
	@FXML
	public void iniciar() {
		bolinha.setFill(Color.GREEN);
	}
	
	@FXML
	private void mudarCena04() {
		Main.mudarCena("/gui/Cena04.fxml");
	}

}
