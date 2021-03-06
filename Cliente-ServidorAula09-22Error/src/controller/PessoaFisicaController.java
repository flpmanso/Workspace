package controller;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import entities.PessoaFisica;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import persistence.PessoaFisicaDAO;
import service.PessoaFisiscaService;

public class PessoaFisicaController implements Initializable{

    @FXML
    private TableView<PessoaFisica> tabela;

    @FXML
    private TableColumn<PessoaFisica, String> nomeCol;

    @FXML
    private TableColumn<PessoaFisica, Integer> idadeCol;

    @FXML
    private TableColumn<PessoaFisica, String> enderecoCol;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		nomeCol.setCellValueFactory(
                new PropertyValueFactory<>("nome"));
        idadeCol.setCellValueFactory(
                new PropertyValueFactory<>("idade"));
        enderecoCol.setCellValueFactory(
                new PropertyValueFactory<>("endereco"));
        
        tabela.setItems(PessoaFisiscaService.percorrerArquivo(PessoaFisicaDAO.getPath(), lista));
	}

	
	public static observarList(String path, List<PessoaFisica> lista) {

		
	}
}
