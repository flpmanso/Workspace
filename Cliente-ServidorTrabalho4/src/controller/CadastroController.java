package controller;

import java.net.URL;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ResourceBundle;

import entities.Cadastro;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import persistence.CadastroDAO;

public class CadastroController implements Initializable {

	URL arg0 = null;
	ResourceBundle arg1 = null;

	@FXML
	private TableView<Cadastro> tbvCadastro;

	@FXML
	private TextField txtID;

	@FXML
	private TextField txtNome;

	@FXML
	private TextField txtResponsavel;

	@FXML
	private DatePicker txtDataInauguracao;

	@FXML
	private TextField txtTamanhoLoja;

	@FXML
	private TextField txtValorAluguel;

	@FXML
	private Tab tabListarCadastros;

	@FXML
	private TableColumn<Cadastro, Number> tbvId;

	@FXML
	private TableColumn<Cadastro, String> tbvNomeLoja;

	@FXML
	private TableColumn<Cadastro, String> tbvResponsavel;

	@FXML
	private TableColumn<Cadastro, String> tbvDataInauguracao;

	@FXML
	private TableColumn<Cadastro, Number> tbvTamanhoLoja;

	@FXML
	private TableColumn<Cadastro, Number> tbvValorAluguel;

	@FXML
	void btnAlterarOnAction(ActionEvent event) {

		try {
			int id = Integer.parseInt(txtID.getText());

			String nomeLoja = txtNome.getText();
			String responsavel = txtResponsavel.getText();
			Date dataInauguracao = Date.valueOf(txtDataInauguracao.getValue());
			Double tamanhoLoja = Double.parseDouble(txtTamanhoLoja.getText());
			Double valorAluguel = Double.parseDouble(txtValorAluguel.getText());

			CadastroDAO.alterar(id, nomeLoja, responsavel, dataInauguracao, tamanhoLoja, valorAluguel);

			Alert alert = new Alert(AlertType.INFORMATION, "Dados Alterados com sucesso", ButtonType.OK);
			alert.setTitle("Atenção");
			alert.setHeaderText("Informação");
			alert.show();
			// Atualizar TableView após Action
			initialize(arg0, arg1);
		} catch (Exception e) {
			Alert alert = new Alert(AlertType.INFORMATION, "Erro na alteração dos dados", ButtonType.OK);
			alert.setTitle("Atenção");
			alert.setHeaderText("Informação");
			alert.show();
		}
	}

	@FXML
	void btnBuscarOnAction(ActionEvent event) {
		if (CadastroDAO.buscar(Integer.parseInt(txtID.getText())) != null) {
			Cadastro cadastro = CadastroDAO.buscar(Integer.parseInt(txtID.getText()));
			txtNome.setText(cadastro.getNomeLoja());
			txtResponsavel.setText(cadastro.getResponsavel());
			txtDataInauguracao.setValue(LocalDate.parse(cadastro.getDataInauguracao()));
			txtTamanhoLoja.setText(String.valueOf(cadastro.getTamanhoLoja()));
			txtValorAluguel.setText(String.valueOf(cadastro.getValorAluguel()));
		} else {

			Alert alert = new Alert(AlertType.INFORMATION, "ID informado não encontrado", ButtonType.OK);
			alert.setTitle("Atenção");
			alert.setHeaderText("Informação");
			alert.show();
		}

	}

	@FXML
	void btnExcuirOnAction(ActionEvent event) {

		try {
			int id = Integer.parseInt(txtID.getText());

			CadastroDAO.deletar(id);

			Alert alert = new Alert(AlertType.INFORMATION, "Dados Deletados com sucesso", ButtonType.OK);
			alert.setTitle("Atenção");
			alert.setHeaderText("Informação");
			alert.show();
			// Atualizar TableView após Action
			initialize(arg0, arg1);
		} catch (Exception e) {
			Alert alert = new Alert(AlertType.INFORMATION, "Erro ao deletar os dados", ButtonType.OK);
			alert.setTitle("Atenção");
			alert.setHeaderText("Informação");
			alert.show();
		}
	}

	@FXML
	void btnInserirOnAction(ActionEvent event) {

		try {
			int id = Integer.parseInt(txtID.getText());
			String nomeLoja = txtNome.getText();
			String responsavel = txtResponsavel.getText();
			Date dataInauguracao = Date.valueOf(txtDataInauguracao.getValue());
			Double tamanhoLoja = Double.parseDouble(txtTamanhoLoja.getText());
			Double valorAluguel = Double.parseDouble(txtValorAluguel.getText());

			CadastroDAO.inserir(id, nomeLoja, responsavel, dataInauguracao, tamanhoLoja, valorAluguel);

			Alert alert = new Alert(AlertType.INFORMATION, "Dados Inseridos com sucesso", ButtonType.OK);
			alert.setTitle("Atenção");
			alert.setHeaderText("Informação");
			alert.show();

			// limpar campos do pane
			txtID.clear();
			txtNome.clear();
			txtResponsavel.clear();
			txtTamanhoLoja.clear();
			txtValorAluguel.clear();

			// Atualizar TableView após Action
			initialize(arg0, arg1);

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.INFORMATION, "Erro na inclusão dos dados", ButtonType.OK);
			alert.setTitle("Atenção");
			alert.setHeaderText("Informação");
			alert.show();
		}
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// Inicialização mascaras
		CadastroMascara.mascaraNumeroInteiro(txtID);
		CadastroMascara.mascaraData(txtDataInauguracao);
		CadastroMascara.mascaraNumero(txtTamanhoLoja);
		CadastroMascara.mascaraNumero(txtValorAluguel);

		// Inicializar e preencher TableView
		tbvId.setCellValueFactory(cellData -> cellData.getValue().idProperty());
		tbvNomeLoja.setCellValueFactory(cellData -> cellData.getValue().nomeLojaProperty());
		tbvResponsavel.setCellValueFactory(cellData -> cellData.getValue().responsavelProperty());
		tbvDataInauguracao.setCellValueFactory(cellData -> cellData.getValue().dataInauguracaoProperty());
		tbvTamanhoLoja.setCellValueFactory(cellData -> cellData.getValue().tamanhoLojaProperty());
		tbvValorAluguel.setCellValueFactory(cellData -> cellData.getValue().valorAluguelProperty());

		ObservableList<Cadastro> masterData = FXCollections.observableArrayList();

		masterData = CadastroDAO.converterArrayListToObservableList();

		FilteredList<Cadastro> filteredData = new FilteredList<>(masterData, p -> true);

		tbvCadastro.setItems(filteredData);

		// Pegar ultio ID no BD e já mostrar na tela
		txtID.setText(Integer.toString(CadastroDAO.pegarUltimoId()));

		// Pegar a data atual local e já mostrar na tela
		txtDataInauguracao.setValue(LocalDate.now());

		// Verificar se campos Nome Loja e Responsavel vão conter < 100 caracteres
		txtNome.textProperty().addListener((observa) -> {
			if (txtNome.getText().length() > 100) {
				Alert alert = new Alert(AlertType.INFORMATION, "Informações do nome devem conter até 100 caracteres.",
						ButtonType.OK);
				alert.setTitle("Atenção");
				alert.setHeaderText("Informação");
				alert.show();
			}
		});

		txtResponsavel.textProperty().addListener((observa) -> {
			if (txtResponsavel.getText().length() > 100) {
				Alert alert = new Alert(AlertType.INFORMATION, "Informações do nome devem conter até 100 caracteres.",
						ButtonType.OK);
				alert.setTitle("Atenção");
				alert.setHeaderText("Informação");
				alert.show();
			}
		});

	}

}
