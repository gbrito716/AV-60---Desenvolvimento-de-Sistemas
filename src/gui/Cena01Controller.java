package gui;

import application.Main;
import javafx.fxml.FXML;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Cena01Controller {
	
	@FXML
	private Circle bolinha;
	
	@FXML
	public void iniciar() {
		bolinha.setFill(Color.RED);
	}
	
	@FXML
	private void mudarCena02() {
		Main.mudarCena("/gui/Cena02.fxml");
	}

}
