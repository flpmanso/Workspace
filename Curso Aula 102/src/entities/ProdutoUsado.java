package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto{	
	
	public static Date dataDeProducao;
	SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyyy");

	public ProdutoUsado(String nome, Double preco, Date dataDeProducao) {
		super(nome, preco);
		ProdutoUsado.dataDeProducao = dataDeProducao;
	}

	public Date getDataDeProducao() {
		return dataDeProducao;
	}

		
	public static void setDataDeProducao(Date dataDeProducao) {
		ProdutoUsado.dataDeProducao = dataDeProducao;
	}

	@Override
	public void etiquetar() {
		System.out.println(nome
				+" $ "
				+preco
				+" (data de Produção: "
				+dt.format(dataDeProducao)
				+")");
	}

}
