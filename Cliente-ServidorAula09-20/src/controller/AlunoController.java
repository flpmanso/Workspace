package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;

public class AlunoController {

	@FXML
	private TextField txtMatricula;

	@FXML
	private TextField txtNome;

	@FXML
	private TextField txtMensalidade;

	@FXML
	private Button btnValidar;

	@FXML
	void btnValidarOnAction(ActionEvent event) {
		Alert alert;
		if (txtMatricula.getText().length() > 0 && txtMatricula.getText().length() <= 10
				&& txtNome.getText().length() > 0 && txtNome.getText().length() <= 50) {
			try {
				alert = new Alert(AlertType.INFORMATION, "informa��es Corretas", ButtonType.OK);
				alert.setTitle("Aten��o!");
				alert.setHeaderText("Informa��o");
				alert.show();
			} catch (Exception e) {
				alert = new Alert(AlertType.INFORMATION, "Informa��es incorretas", ButtonType.OK);
				alert.setTitle("Aten��o!");
				alert.setHeaderText("Informa��o");
				alert.show();
			}
		} else {
			alert = new Alert(AlertType.INFORMATION, "Informa��es incorretas", ButtonType.OK);
			alert.setTitle("Aten��o!");
			alert.setHeaderText("Informa��o");
			alert.show();
		}
	}

}
