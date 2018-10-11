package services;

public interface ServicoPagamentoOnline {
	
	public Double taxaPagamento(double valor);
	public Double acrescimo(double valor, int meses);

}
