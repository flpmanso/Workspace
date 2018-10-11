package controller;

import java.util.ResourceBundle;

import javax.print.DocFlavor.URL;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;

public class AlunoController implements Initializable {

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

	}

	@Override
	public void initialize(java.net.URL location, ResourceBundle resources) {
		txtMatricula.textProperty().addListener((observa) -> {
			if (txtMatricula.getText().length() > 10) {
				Alert alert = new Alert(AlertType.INFORMATION, "A matricula s� pode conter at� 10 caracteres",
						ButtonType.OK);
				alert.setTitle("Aten��o");
				alert.setHeaderText("Informa��o");
				alert.show();
			}
		});
		txtNome.textProperty().addListener((observa) -> {
			if (txtNome.getText().length() > 50) {
				Alert alert = new Alert(AlertType.INFORMATION, "O nome  s� pode conter at� 50 caracteres",
						ButtonType.OK);
				alert.setTitle("Aten��o");
				alert.setHeaderText("Informa��o");
				alert.show();
			}
		});

	}
}
