package services;

public class SevicoPaypal implements ServicoPagamentoOnline {

	@Override
	public Double taxaPagamento(double valor) {
		return valor * 0.2;
	}

	@Override
	public Double acrescimo(double valor, int meses) {
		return valor + (valor * 0.1 * meses);
	}

}
