package controller;

import java.util.regex.Pattern;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;

public class AlunoController {

	private static Pattern decimalPattern = Pattern.compile("[0-9]*\\,[0-9]*?");

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
		if (txtMatricula.getText().length() > 0 && txtMatricula.getText().length() <= 10) {
			if (txtNome.getText().length() > 0 && txtNome.getText().length() <= 50) {
				if (decimalPattern.matcher(txtMensalidade.getText()).matches()) {

					alert = new Alert(AlertType.INFORMATION, "informa��es Corretas.", ButtonType.OK);
					alert.setTitle("Aten��o!");
					alert.setHeaderText("Informa��o");
					alert.show();
				} else {
					alert = new Alert(AlertType.INFORMATION, "Informa��es da mensalidade devem ser no formato decimal.", ButtonType.OK);
					alert.setTitle("Aten��o!");
					alert.setHeaderText("Informa��o");
					alert.show();

				}
			}else {
				alert = new Alert(AlertType.INFORMATION, "Informa��es do nome devem conter at� 50 caracteres.", ButtonType.OK);
				alert.setTitle("Aten��o!");
				alert.setHeaderText("Informa��o");
				alert.show();
			}
		} else {
			alert = new Alert(AlertType.INFORMATION, "Informa��es de Matricula devem possir at� 10 caracteres.", ButtonType.OK);
			alert.setTitle("Aten��o!");
			alert.setHeaderText("Informa��o");
			alert.show();
		}
	}

}
