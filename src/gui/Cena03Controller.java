package gui;

import application.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
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
	
	@FXML
	private void mudarCena02() {
		Main.mudarCena("/gui/Cena02.fxml");
	}
	
	@FXML
	private void voltarCena01() {
		Main.mudarCena("/gui/Cena01.fxml");
	}
	
	@FXML
	private void BotaoErrado() {
		Alert alerta = new Alert(Alert.AlertType.ERROR);
		alerta.setTitle("Botão Incorreto!");
		alerta.setHeaderText(null);
		alerta.setContentText("ESse botão não muda de cena. Tente outro!");
		alerta.show();
	}

}
