package gui.util;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Alerts {
	
	public static void mostrarErro(String titulo, String mensagem) {
		Alert alerta = new Alert(AlertType.ERROR);
		alerta.setTitle(titulo);
		alerta.setHeaderText(null);
		alerta.setContentText(mensagem);
		alerta.show();
	}

	
}
