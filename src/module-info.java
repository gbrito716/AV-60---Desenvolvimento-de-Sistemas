module AV60 {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	
	opens application to javafx.graphics;
	opens gui to javafx.fxml;
}
