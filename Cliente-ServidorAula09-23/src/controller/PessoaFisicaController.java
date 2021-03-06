package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import persistence.PessoaFisicaDAO;

public class PessoaFisicaController implements Initializable {

	public int i;
	@FXML
	private TextField txtID;

	@FXML
	private TextField txtCPF;

	@FXML
	private TextField txtNome;

	@FXML
	private TextField txtCidade;

	@FXML
	private TextField txtEstado;

	@FXML
	private TextField txtStatus;

	@FXML
	private TextField txtTel1;

	@FXML
	private TextField txtTel3;

	@FXML
	private TextField txtTel2;

	@FXML
	private Button btnAvancar;

	@FXML
	void btnAvancarOnAction(ActionEvent event) {

		int id = Integer.parseInt(txtID.getText());
		String cpf = txtCPF.getText();
		String nome = txtNome.getText();
		String cidade = txtCidade.getText();
		String estado = txtEstado.getText();
		String status = txtStatus.getText();
		String telefone1 = txtTel1.getText();
		String telefone2 = txtTel2.getText();
		String telefone3 = txtTel3.getText();

		PessoaFisicaDAO.escreverArquivo(id, cpf, nome, cidade, estado, status, telefone1, telefone2, telefone3);
		
		Alert alert = new Alert(AlertType.INFORMATION, "Dado inserido com sucesso", ButtonType.OK);
		alert.setTitle("Aten��o");
		alert.setHeaderText("Informa��o");
		alert.show();
	

	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

}
