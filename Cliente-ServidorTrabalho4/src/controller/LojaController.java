package controller;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import entities.Loja;
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
import service.LojaService;

public class LojaController implements Initializable {

	URL arg0 = null;
	ResourceBundle arg1 = null;

	@FXML
	private TableView<Loja> tbvCadastro;

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
	private TableColumn<Loja, Number> tbvId;

	@FXML
	private TableColumn<Loja, String> tbvNomeLoja;

	@FXML
	private TableColumn<Loja, String> tbvResponsavel;

	@FXML
	private TableColumn<Loja, String> tbvDataInauguracao;

	@FXML
	private TableColumn<Loja, Number> tbvTamanhoLoja;

	@FXML
	private TableColumn<Loja, Number> tbvValorAluguel;

	@FXML
	void btnAlterarOnAction(ActionEvent event) {

		try {

			Loja loja = new Loja();

			loja.setId(Integer.parseInt(txtID.getText()));
			loja.setNomeLoja(txtNome.getText());
			loja.setResponsavel(txtResponsavel.getText());
			loja.setDataInauguracao(String.valueOf(txtDataInauguracao.getValue()));
			loja.setTamanhoLoja(Double.parseDouble(txtTamanhoLoja.getText()));
			loja.setValorAluguel(Double.parseDouble(txtValorAluguel.getText()));

			LojaService.alterar(loja);

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

		if (LojaService.buscar(txtNome.getText()) != null) {
			Loja loja = LojaService.buscar(txtNome.getText());
			txtID.setText(Integer.toString(loja.getId()));
			txtNome.setText(loja.getNomeLoja());
			txtResponsavel.setText(loja.getResponsavel());
			txtDataInauguracao.setValue(LocalDate.parse(loja.getDataInauguracao()));
			txtTamanhoLoja.setText(String.valueOf(loja.getTamanhoLoja()));
			txtValorAluguel.setText(String.valueOf(loja.getValorAluguel()));
		} else {

			Alert alert = new Alert(AlertType.INFORMATION, "Nome da Loja informado não encontrado", ButtonType.OK);
			alert.setTitle("Atenção");
			alert.setHeaderText("Informação");
			alert.show();
		}

	}

	@FXML
	void btnExcuirOnAction(ActionEvent event) {

		try {
			
			int id = Integer.parseInt(txtID.getText());

			LojaService.deletar(id);

			Alert alert = new Alert(AlertType.INFORMATION, "Dados Deletados com sucesso", ButtonType.OK);
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
			Alert alert = new Alert(AlertType.INFORMATION, "Erro ao deletar os dados", ButtonType.OK);
			alert.setTitle("Atenção");
			alert.setHeaderText("Informação");
			alert.show();
		}
	}

	@FXML
	void btnInserirOnAction(ActionEvent event) {

		try {
			Loja loja = new Loja();

			//loja.setId(Integer.parseInt(txtID.getText()));
			loja.setNomeLoja(txtNome.getText());
			loja.setResponsavel(txtResponsavel.getText());
			loja.setDataInauguracao(String.valueOf(txtDataInauguracao.getValue()));
			loja.setTamanhoLoja(Double.parseDouble(txtTamanhoLoja.getText()));
			loja.setValorAluguel(Double.parseDouble(txtValorAluguel.getText()));

			LojaService.inserir(loja);

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

	@FXML
	void btnNovoOnAction(ActionEvent event) {
		// Pegar a data atual local e já mostrar na tela
		txtDataInauguracao.setValue(LocalDate.now());

		// limpar campos do pane
		txtID.clear();
		txtNome.clear();
		txtResponsavel.clear();
		txtTamanhoLoja.clear();
		txtValorAluguel.clear();
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// Inicialização mascaras
		LojaMascara.mascaraNumeroInteiro(txtID);
		LojaMascara.mascaraData(txtDataInauguracao);
		LojaMascara.mascaraNumero(txtTamanhoLoja);
		LojaMascara.mascaraNumero(txtValorAluguel);

		// Inicializar e preencher TableView
		tbvId.setCellValueFactory(cellData -> cellData.getValue().idProperty());
		tbvNomeLoja.setCellValueFactory(cellData -> cellData.getValue().nomeLojaProperty());
		tbvResponsavel.setCellValueFactory(cellData -> cellData.getValue().responsavelProperty());
		tbvDataInauguracao.setCellValueFactory(cellData -> cellData.getValue().dataInauguracaoProperty());
		tbvTamanhoLoja.setCellValueFactory(cellData -> cellData.getValue().tamanhoLojaProperty());
		tbvValorAluguel.setCellValueFactory(cellData -> cellData.getValue().valorAluguelProperty());

		ObservableList<Loja> masterData = FXCollections.observableArrayList();

		masterData = LojaService.converterArrayListToObservableList();

		FilteredList<Loja> filteredData = new FilteredList<>(masterData, p -> true);

		tbvCadastro.setItems(filteredData);

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
