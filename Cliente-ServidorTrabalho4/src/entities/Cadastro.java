package entities;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Cadastro {

	private Integer id;
	private String nomeLoja;
	private String responsavel;
	private String dataInauguracao;
	private Double tamanhoLoja;
	private Double valorAluguel;

	public Cadastro() {

	}

	public Cadastro(Integer id, String nomeLoja, String responsavel, String dataInauguracao, Double tamanhoLoja,
			Double valorAluguel) {
		super();
		this.id = id;
		this.nomeLoja = nomeLoja;
		this.responsavel = responsavel;
		this.dataInauguracao = dataInauguracao;
		this.tamanhoLoja = tamanhoLoja;
		this.valorAluguel = valorAluguel;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeLoja() {
		return nomeLoja;
	}

	public void setNomeLoja(String nomeLoja) {
		this.nomeLoja = nomeLoja;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public String getDataInauguracao() {
		return dataInauguracao;
	}

	public void setDataInauguracao(String dataInauguracao) {
		this.dataInauguracao = dataInauguracao;
	}

	public Double getTamanhoLoja() {
		return tamanhoLoja;
	}

	public void setTamanhoLoja(Double tamanhoLoja) {
		this.tamanhoLoja = tamanhoLoja;
	}

	public Double getValorAluguel() {
		return valorAluguel;
	}

	public void setValorAluguel(Double valorAluguel) {
		this.valorAluguel = valorAluguel;
	}

	public SimpleIntegerProperty idProperty() {
		return new SimpleIntegerProperty(id);
	}

	public StringProperty nomeLojaProperty() {
		return new SimpleStringProperty(nomeLoja);
	}

	public StringProperty responsavelProperty() {
		return new SimpleStringProperty(responsavel);
	}

	public StringProperty dataInauguracaoProperty() {
		return new SimpleStringProperty(dataInauguracao);
	}

	public SimpleDoubleProperty tamanhoLojaProperty() {
		return new SimpleDoubleProperty(tamanhoLoja);
	}

	public SimpleDoubleProperty valorAluguelProperty() {
		return new SimpleDoubleProperty(valorAluguel);
	}

	@Override
	public String toString() {
		return "Cadastro [id=" + id + ", nomeLoja=" + nomeLoja + ", responsavel=" + responsavel + ", dataInauguracao="
				+ dataInauguracao + ", tamanhoLoja=" + tamanhoLoja + ", valorAluguel=" + valorAluguel + "]";
	}

}
