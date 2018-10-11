package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {
	
	private int numero;
	private Date data;
	private Double valorTotal;
	
	private List<Parcelas> parcelas = new ArrayList<>();
	
	public Contrato(int numero, Date data, Double valorTotal) {
		this.numero = numero;
		this.data = data;
		this.valorTotal = valorTotal;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public List<Parcelas> getParcelas() {
		return parcelas;
	}
	public void setParcelas(List<Parcelas> parcelas) {
		this.parcelas = parcelas;
	}
	
	public void adicionarParcela(Parcelas parcela) {
		parcelas.add(parcela);
	}
	
	public void removerParcelas(Parcelas parcela) {
		parcelas.remove(parcela);
	}
	
	
	

}
