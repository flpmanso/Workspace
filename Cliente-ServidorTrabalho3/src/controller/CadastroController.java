package controller;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
			 
public class CadastroController implements Initializable {
	
    @FXML
    private TextField textField;
    
	@Override
	public void initialize(java.net.URL location, ResourceBundle resources) {
		Mascara.cpfField(this.textField);		
	}
	
	
}
