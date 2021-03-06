package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;

public class PessoaController {

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtIdade;

    @FXML
    private Button btnSalvar;

    @FXML
    private Button btnCancelar;

    @FXML
    void btnCancelarOnAction(ActionEvent event) {
    	Alert alert;
    	alert = new Alert(AlertType.INFORMATION,"Voc� cliclou em Cancelar", ButtonType.OK);
    	alert.setTitle("Aten��o");
    	alert.setHeaderText("informa��o:");
    	alert.show();

    }

    @FXML
    void btnSalvarOnAction(ActionEvent event) {
    	Alert alert;
    	alert = new Alert(AlertType.INFORMATION,"Voc� cliclou em Salvar", ButtonType.OK);
    	alert.setTitle("Aten��o");
    	alert.setHeaderText("informa��o:");
    	alert.show();

    }

}
