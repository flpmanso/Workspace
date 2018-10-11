package controller;

import java.net.URL;
import java.util.ResourceBundle;

import entities.PessoaFisica;
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

		try  {

			PessoaFisica pf = PessoaFisicaDAO.percorrerArquivo().get(i);
			txtID.setText(Integer.toString(pf.getId()));
			txtCPF.setText(pf.getCpf());
			txtNome.setText(pf.getNomeCompleto());
			txtCidade.setText(pf.getCidade());
			txtEstado.setText(pf.getEstado());
			txtStatus.setText(pf.getStatus());
			txtTel1.setText(pf.getTelefoneCelular());
			txtTel2.setText(pf.getTelefoneComercial());
			txtTel3.setText(pf.getTelefoneContato());
			i++;
		} catch(Exception e) {
			Alert alert = new Alert(AlertType.INFORMATION, "Fim da Lista", ButtonType.OK);
			alert.setTitle("Atenção");
			alert.setHeaderText("Informação");
			alert.show();
		}
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btnAvancarOnAction(null);
	}

}
