package gui;

import application.Main;
import javafx.fxml.FXML;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Cena04Controller {

	@FXML
	private Circle bolinha;
	
	@FXML
	public void iniciar() {
		bolinha.setFill(Color.ORANGE);
	}
	
	@FXML
	private void voltarCena01() {
		Main.mudarCena("/gui/Cena01.fxml");
	}

}
