package controller;

import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import persistence.AlunoDAO;

public class AlunoController implements Initializable {

	@FXML
	private TextField txtMatricula;

	@FXML
	private TextField txtNome;

	@FXML
	private TextField txtDataNascimento;

	@FXML
	private Button btnAvancar;

	@FXML
	void btnAvancarOnAction(ActionEvent event) {

		int matricula = Integer.parseInt(txtMatricula.getText());
		String nome = txtNome.getText();
		String dataNascimento = txtDataNascimento.getText();

		AlunoDAO.inserir(matricula, nome, dataNascimento);

		Alert alert = new Alert(AlertType.INFORMATION, "Dados Inseridos com sucesso", ButtonType.OK);
		alert.setTitle("Aten��o");
		alert.setHeaderText("Informa��o");
		alert.show();

	}

	@Override
	public void initialize(java.net.URL location, ResourceBundle resources) {

	}

}
